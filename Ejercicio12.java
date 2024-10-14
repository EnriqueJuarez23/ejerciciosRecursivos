class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("ARREGLO");
        System.out.println("-----------------------------");
        char [] a = {'E', 'N', 'R', 'I', 'Q', 'U', 'E' };
        System.out.println(arreglo(a));
    }
        public static char arreglo(char [] a){
            int i;
            for(i=0;i<=a.length-1;i++){
                System.out.println(a[i]);
                }
            return a[i];
        }
    }