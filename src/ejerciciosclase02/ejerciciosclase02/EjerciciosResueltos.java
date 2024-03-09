package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02.ejerciciosclase02;

import java.util.Scanner;

public class EjerciciosResueltos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un año: ");
        int year = scanner.nextInt();

        if (esAnioBisiesto(year)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    public static boolean esAnioBisiesto(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

/*Ejercicio de Verificación de Año Bisiesto:
Crea un programa en Java que solicite al usuario ingresar un
año y determine si es un año bisiesto o no. Un año bisiesto es aquel
divisible por 4, excepto aquellos divisibles por 100 pero no por 400.
Por ejemplo, 2000 y 2400 son años bisiestos, mientras que 1800, 1900
 y 2100 no lo son.*/