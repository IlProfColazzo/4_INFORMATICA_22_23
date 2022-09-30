package introduzioneAlJava;

import java.util.Scanner;

/**
 * Riscrivi l'esercizio precedente utilizzando solo variabili di tipo float
 */
public class Es15 {

    public static void main(String[] args) {
        double num1, num2, num3;
        double divis1, divis2, divis3, divis4, divis5, divis6, divis7, divis8, divis9;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire primo numero: ");
        num1 = tastiera.nextDouble();
        System.out.println("Inserire secondo numero: ");
        num2 = tastiera.nextDouble();
        System.out.println("Inserire terzo numero: ");
        num3 = tastiera.nextDouble();

        divis1 = num1 / num1;
        divis2 = num1 / num2;
        divis3 = num1 / num3;
        divis4 = num2 / num1;
        divis5 = num2 / num2;
        divis6 = num2 / num3;
        divis7 = num3 / num1;
        divis8 = num3 / num2;
        divis9 = num3 / num3;

        System.out.println(num1 + " / " + num1 + " = " + divis1);
        System.out.println(num1 + " / " + num2 + " = " + divis2);
        System.out.println(num1 + " / " + num3 + " = " + divis3);
        System.out.println(num2 + " / " + num1 + " = " + divis4);
        System.out.println(num2 + " / " + num2 + " = " + divis5);
        System.out.println(num2 + " / " + num3 + " = " + divis6);
        System.out.println(num3 + " / " + num1 + " = " + divis7);
        System.out.println(num3 + " / " + num2 + " = " + divis8);
        System.out.println(num3 + " / " + num3 + " = " + divis9);
    }

}
