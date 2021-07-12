import java.util.Scanner;

public class Mayor_menornumero {
    public static void main(String[] args) {
        System.out.println("digite el numero 3:");
        Scanner dato=new Scanner(System.in);
        int n=dato.nextInt();
        int arreglo[]=new int [n];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingrese dato:"+(i+1)+":");
            arreglo[i]=dato.nextInt();
        }

        int mayor;
        int menor;
        int intermedio;

        mayor=menor=intermedio=arreglo[0];

        for(int i=0;i < arreglo.length;i++){
            if(arreglo[i] > mayor){
                mayor=arreglo[i];
            }
            if(arreglo[i] < menor){
                menor=arreglo[i];
            }
        if(arreglo[i]>menor && arreglo[i]<mayor){
            intermedio=arreglo[i];
        }
        }

        
        System.out.println("el valor mayor es:"+mayor);
        System.out.println("el valor menor es:"+menor);
        System.out.println("el valor intermedio es: "+intermedio);
    }
}
