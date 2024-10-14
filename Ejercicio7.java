import java.util.Scanner;
class Ejercicio7 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("AREA DE UN CUADRADO");
        System.out.println("-----------------------------");
        System.out.println("Ingresa el lado:");
        int l = op.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("El area es:"+ " lado: " + l+ " * " + " lado:"+ l + " = "+ lado(l));
    }
    public static int lado(int a){
        return a*a;
    }
}