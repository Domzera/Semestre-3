import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FExer4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        FData fdatas = new FData();

        int dia = 0, mes = 0, ano = 0, dia2 = 0, mes2 = 0, ano2 = 0;

        System.out.println("\n Entre com as datas [dia/mes/ano]");
        System.out.print(" Data 1:\n");
        System.out.print(" Dia: ");
        fdatas.setDia(leia.nextInt());
        System.out.print(" Mês: ");
        fdatas.setMes(leia.nextInt());
        System.out.print(" Ano: ");
        fdatas.setAno(leia.nextInt());
        /*ano = fdatas.getAno();
        mes = fdatas.getMes();
        dia = fdatas.getDia();*/
        LocalDate data = LocalDate.of(ano, mes, dia);

        System.out.print("\n Data 2:\n");

        System.out.print(" Dia: ");
        fdatas.setDia2(leia.nextInt());
        System.out.print(" Mês: ");
        fdatas.setMes2(leia.nextInt());
        System.out.print(" Ano: ");
        fdatas.setAno2(leia.nextInt());
        ano2 = fdatas.getAno2();
        mes2 = fdatas.getMes2();
        dia2 = fdatas.getDia2();
        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);

        System.out.println("\n Primeira Data inserida é: " + fdatas.mostraData());
        System.out.println(" Data é" + (fdatas.dataValida() ? " Valida!" : " Invalida!"));

        System.out.println("\n Segunda Data inserida é: " + fdatas.mostraData2());
        System.out.println(" Data é" + (fdatas.dataValida2() ? " Valida!" : " Invalida!"));

        System.out.println(fdatas.compararData());

        System.out.println("\n\tFim do programa...\n");
    }
}
