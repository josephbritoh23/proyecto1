package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02.ejerciciosclase02;
import java.util.Scanner;

public class ordenamiento_numero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        int intermedio = num2;
        int menor = num3;

        if (num2 > mayor) {
            mayor = num2;
            intermedio = num1;
        } else if (num2 < menor) {
            menor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
            intermedio = Math.max(num1, num2);
            menor = Math.min(num1, num2);
        } else if (num3 < menor) {
            menor = num3;
        }

        System.out.println("Menor: " + menor);
        System.out.println("Intermedio: " + intermedio);
        System.out.println("Mayor: " + mayor);
    }
}