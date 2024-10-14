import java.util.Scanner;
class Ejercicio9 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("AREA DE UN HEXAGONO");
        System.out.println("-----------------------------");
        System.out.println("Ingresa el apotema:");
        int a = op.nextInt();
        System.out.println("Ingresa perimetro:");
        int p = op.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("El area es:"+" apotema : "+a+ " *" + " perimetro : "+p+ " /2 "+" = "+area(a, p));
    }
    public static int area(int a, int p){
        return p*a/2;
    }
}