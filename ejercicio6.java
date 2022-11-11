import java.util.Scanner;

class Main {

    public static void main(String[] args) {
  Scanner lector = new Scanner(System.in);
    System.out.println("numero de alumnos: ");
    int n;
    double m;
    n = lector.nextInt();
    double[] arreglo = new double[n];
    for(int i=0;i<n;i++){
      System.out.println(" altura de alumno " + (i+1) + ":");
      arreglo[i] = lector.nextDouble();
    }
    m = arreglo[0];
    for (int i=1;i<n;i++){
      m = m + arreglo[i];
    }
    m = m/n;
    System.out.println("la media de los alumnos es : " + m);
    int bajos = 0;
    int altos = 0;
    int medianos = 0;
    for (int i=0;i<n;i++){
      if (arreglo[i]<m){
        bajos = bajos+1;
      }
      else if(arreglo[i]>m){
        altos = altos+1;
      }
      else if(arreglo[i]==m){
        medianos = medianos+1;
      }
    }
    System.out.println("los alumnos altos sobre la media son : " + altos);
    System.out.println("los alumnos bajo sobre la media son : " + bajos);
    System.out.println("los alumnos igual a la media son : " + medianos);
  }
}