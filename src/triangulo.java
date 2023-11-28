import java.util.Scanner;

public class triangulo {
    /* El ejercicio nos pide introducir un número n, y que dibuje un triángulo rectángulo
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Ingresa un número n: ");
        n = scanner.nextInt();
        /* Con el primer for lo que establecemos es la altura del triángulo.
         */
        for (int filas = 0; filas < n; filas++)
        {
            /* Aquí establecemos que se introduce un asterisco por columna, hasta que
            en la última línea iguala con las filas.
             */
            for (int columna = 0; columna <= filas; columna++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");

        }
    }
}