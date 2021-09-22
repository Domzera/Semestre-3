import java.util.Scanner;

class  ex_01{

    public static void main(String[] args) {

        //Variaveis para for e array
        int i, j, k, l, tamanho;
        //Variavel para for infinito e maior numero de array
        int continuacao = 0, auxiliar = 2, maior = 0;
        //Variavel contador
        int contadorPrimo = 0, contTamanho = 0;
        int[][] matrizPrimo;
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

        for (i = 0; i < tamanho; i++){
            System.out.print(ordenada[i]);
        }

        matrizPrimo = new int[tamanho][maior+1];

        System.out.println("\nMATRIZ:");

       //for para acessar linhas da matriz
        for(i = 0; i < matrizPrimo.length; i++){

            //Reset das variaveis
            auxiliar = 3;
            continuacao = 0;
            contTamanho = 0;

            //for para acessar colunas da matriz
            for(j = 0; j < matrizPrimo[i].length; j++){
                //valiadão para colocar valores do array Ordenada na primeira coluna da matriz
                if(j == 0){

                    matrizPrimo[i][0] = ordenada[i];

                }else{
                    //Validação para verifica o tamanho da linha digitado pelo usuario
                    if(contTamanho == ordenada[i]){
                        break;
                    }
                    //for para primos
                    for(k = continuacao;k <= auxiliar ; k++){
                        auxiliar++;
                        contadorPrimo = 0;
                        
                        //for para validar se é primo
                        for(l = 1; l <= k; l++){
            
                            if(k%l == 0){
                                contadorPrimo++;
                            }
                        }
            
                        //Validação para ver se é primo ou 1 pois n tem como o for saber que numero 1 é primo
                        if(contadorPrimo == 2 || k == 1){
                            matrizPrimo[i][j] = k;
                            //Atribuição do k na variave continuacao para prosseguir com os numeros primos sem voltar para 0
                            continuacao = k + 1;
                            contTamanho++;
                            break;
                        }
                }

                }

                System.out.print(matrizPrimo[i][j] + ", ");

            }
            System.out.println();
        }
    }
}   
