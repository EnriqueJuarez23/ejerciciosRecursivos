import java.util.Scanner;
class Ejercicio4 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa un numero:");
        double a = op.nextDouble();
        System.out.println("Ingresa un numero:");
        double b = op.nextDouble();
        System.out.println("-----------------------------------");
        System.out.println(+a+"/"+b+ "="+ dividir(a, b));
    }
    public static double dividir(double a, double b){
        return a/b;
    }
}