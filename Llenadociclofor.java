import java.util.Scanner;

public class Llenadociclofor {
    public static void main(String[] args) {
        System.out.println("escoge un numero cualquiera");
        Scanner dato=new Scanner(System.in);
        int datos=dato.nextInt();
        int arreglo[]=new int [datos];

        for(int i=0;i<=arreglo.length;i++){
            
            if(arreglo[i] % 2==0){
                System.out.println(i+" "+ arreglo[i]);
            }else if(arreglo[i] % 2 != 0){
                System.out.println(i+" "+ arreglo[i]);
            }
        } 
    } 
      
}
