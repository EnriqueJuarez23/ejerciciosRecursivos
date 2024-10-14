
import java.util.Scanner;

class Ejercicio8 {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("AREA DE UN RECTANGULO");
        System.out.println("-----------------------------");
        int a = 30;
        System.out.println("Ingresa la base:");
        int b = op.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("El area es:" + " area: " + a + " base : " + b + " = " + base(a, b));
    }

    public static int base(int a, int b) {
        return a * b;
    }
}
