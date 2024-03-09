package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

public class Patron_Asteriscos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



