import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ListaMarcos arroz = new ListaMarcos(10);
        arroz.add(1);
        arroz.add(2);
        arroz.add(4);
        arroz.add(2,3);
        arroz.retornaTodos();
    }
}