class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("ARREGLO");
        System.out.println("-----------------------------");
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arreglo(a));
    }
        public static int arreglo(int [] a){
            int i;
            for(i=0;i<=a.length-1;i++){
                System.out.println(a[i]);
                }
            return a[i];
        }
    }