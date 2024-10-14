import java.util.Scanner;
class Ejercicio6 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("AREA DE UN RECTANGULO");
        System.out.println("-----------------------------");
        System.out.println("Ingresa la base:");
        int a = op.nextInt();
        System.out.println("Ingresa la altura:");
        int b = op.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("El area es:"+    " base : "+a+ " *" + " altura : "+b+ " = "+area(a, b));
    }
    public static int area(int a, int b){
        return a*b;
    }
}