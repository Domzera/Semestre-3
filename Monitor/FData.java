import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class FData {
    private int dia;
    private int mes;
    private int ano;
    private int dia2;
    private int mes2;
    private int ano2;
    private int data;
    private int data2;

    public FData() {
        this.dia = 0;
        this.mes = 0;
        this.ano2 = 0;
        this.dia2 = 0;
        this.mes2 = 0;
        this.ano2 = 0;
        this.data = 0;
        this.data2 = 0;
    }

    // setData 1
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setData(int data) {
        this.data = data;
    }

    // setData 2
    public void setDia2(int dia2) {
        this.dia2 = dia2;
    }

    public void setMes2(int mes2) {
        this.mes2 = mes2;
    }

    public void setAno2(int ano2) {
        this.ano2 = ano2;
    }

    public void setData2(int data2) {
        this.data = data2;
    }

    // getData 1
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getData() {
        return data;
    }

    // getData 2
    public int getDia2() {
        return dia2;
    }

    public int getMes2() {
        return mes2;
    }

    public int getAno2() {
        return ano2;
    }

    public int getData2() {
        return data2;
    }

    public String mostraData() {

        return dia + "/" + mes + "/" + ano;
    }

    public String mostraData2() {

        return dia2 + "/" + mes2 + "/" + ano2;
    }

    public boolean dataValida() {

        return (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1 && ano <= 9999);
    }

    public boolean dataValida2() {

        return (dia2 >= 1 && dia2 <= 31 && mes2 >= 1 && mes2 <= 12 && ano2 >= 1 && ano2 <= 9999);
    }
    
    public LocalDate teste(int ano,int mes,int dia){
		return teste;
		}

    public String compararData(){

        if (data.compareTo(data2) > 0) {
            return 1;//String.format(" primeira Data é maior");
        } else if (Integer.data.compareTo(data2) < 0) {
            return String.format(" Segunda Data é maior");
        } else if (Integer.data.compareTo(data2) == 0) {
            return String.format(" Datas Iguais ");}
    }/*

    public void diferancaDias() {
        Long distaciaDias = ChronoUnit.DAYS.between(data, data2);
        System.out.println("\n Numero de Dias entre as DATAS ==> " + distaciaDias);
    }*/

}
