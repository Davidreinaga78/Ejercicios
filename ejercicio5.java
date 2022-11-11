import java.util.Scanner;

class Main {

     public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int n;
        int[] numeros = new int[10];
        double media = 0;

        System.out.println("Lectura de los elementos del array: ");
        for (n = 0; n < 10; n++) {
            System.out.print("numeros[" + n + "]= ");
            numeros[n] = lector.nextInt();
        }
        
        for (n = 0; n < 10; n++) {
            if (n % 2 == 0){ 
                media = media + numeros[n]; 
            }
        }
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);              
    }
}