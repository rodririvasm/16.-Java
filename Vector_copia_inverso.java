import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Scanner;

public class Vector_copia_inverso {
    public static void main(String[] args) {
        
        System.out.println("introduce datos");
        Scanner dato=new Scanner(System.in);
        int n=dato.nextInt();
        String  arreglo[]=new String [n];

        for(int i=0;i<arreglo.length;i++){
            System.out.println("escribe el caracter "+(i+1)+" : ");
            Scanner letra=new Scanner(System.in);
            String palabra=letra.nextLine();
            arreglo[i]=palabra;
            
        }

        for(int i=0;i<arreglo.length;i++){
            System.out.println("la letra es: "+arreglo[i]);
        }


        int j;
        int i;
        String aux[]=new String [arreglo.length];

        for (i=arreglo.length-1,j=0; i>=0;i--,j++) {
            aux[j]= arreglo[i];

            System.out.println("el reverso es: "+aux[j]);
        }


        
    }  
}
