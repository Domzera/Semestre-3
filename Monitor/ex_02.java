import java.util.Scanner;

class  ex_02{

    public static void main(String[] args) {

        //Variaveis para for e array
        int i, j, k, tamanho;
        //Variavel para for infinito e maior numero de array
        int auxiliar = 3, maior = 0;
        //Variavel contador
        int contadorPrimo = 0, contTamanho = 0, contador = 0;
        int[][] matrizPrimo;
        int[] primos;
        int[] ordenada;

        Scanner leia = new Scanner(System.in);

        System.out.printf("\nDigite quantos termos voce quer para adicionar a matriz: ");
        tamanho = leia.nextInt();
        ordenada = new int[tamanho];

        for (i = 0; i < tamanho; i++){
            System.out.printf("\nDigite o numero de elementos de cada linha da matriz: ");
            ordenada[i] = leia.nextInt();
            if(ordenada[i] > maior){
                maior = ordenada[i];
            }
        }

        primos = new int[maior];

            //for para criar vetor de primos
            for(i = 0;i <= auxiliar ; i++){
                auxiliar++;
                contadorPrimo = 0;
                
                //for para validar se é primo
                for(j = 1; j <= i; j++){

                    if(i%j == 0){
                        contadorPrimo++;
                    }
                }

                //Validação para ver se é primo ou 1 pois n tem como o for saber que numero 1 é primo
                if(contadorPrimo == 2 || i == 1){
                    primos[contador] = i;
                    //Contador para mudar a posição do array
                    contador++;
                    contTamanho++;

                    //Sair do for quando chegar no limite do array de primos
                    if(contTamanho == maior){
                        break;
                    }
                }
          
            }

        matrizPrimo = new int[tamanho][maior+1];

        System.out.println("\nMATRIZ:");

       //for para acessar linhas da matriz
        for(i = 0; i < matrizPrimo.length; i++){

            //Reset das variaveis
            contTamanho = 0;

            //for para acessar colunas da matriz
            for(j = 0; j < matrizPrimo[i].length; j++){

                //validacão para colocar valores do array Ordenada na primeira coluna da matriz
                if(j == 0){

                    matrizPrimo[i][0] = ordenada[i];

                }else{

                    //Verifica se chegou no tamanho exato da linha e quebra a interação na linha
                    if(matrizPrimo[i][0] == contTamanho){
                        break;
                    }

                    //Estou tirando 1 do j pois como ele ja passo a primeira posição, ele ta com valor de 1
                    matrizPrimo[i][j] = primos[j - 1];
                    contTamanho++;

                }

                System.out.print(matrizPrimo[i][j] + ", ");

            }
            System.out.println();
        }
    }
}   
