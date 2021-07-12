import java.util.Scanner;

public class Vector_aleatorio {
    
    public static void main(String[] args) {
        int n=10;
        int arreglo[]=new int [n];

        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingrese dato "+(i+1)+" :");
            int aleatorio=0;
            aleatorio=(int) (Math.random()*100);
            System.out.println(aleatorio);
            System.out.println("su cuadrado es: "+aleatorio*aleatorio);
            System.out.println("su cubo es: "+aleatorio*aleatorio*aleatorio);
            arreglo[i]=aleatorio;
        }
        int mayor;
        int menor;
        mayor=menor=arreglo[0];

        for(int i=0;i<arreglo.length;i++){
        if (arreglo[i]>mayor) {
            mayor=arreglo[i];
           
        }
        if (arreglo[i]<menor) {
            menor=arreglo[i];
        }
    }
     System.out.println("el mayor es:"+mayor);
     System.out.println("el menor es:"+menor);
    }
}
