import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int numero = solicitarNumero();
        System.out.println("¡Gracias! Has ingresado el número: " + numero);
    }
    public static int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, ingresa un número mayor a 20: ");
            numero = scanner.nextInt();

            if (numero <= 20) {
                System.out.println("Error: El número debe ser mayor a 20. Inténtalo de nuevo.");
            }
        } while (numero <= 20);
        return numero;
    }
}