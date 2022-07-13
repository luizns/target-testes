package exercicio05;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma palavra para inverter: ");
        String palavra = sc.next();
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

         System.out.println(palavraInvertida);

        sc.close();
    }
}
