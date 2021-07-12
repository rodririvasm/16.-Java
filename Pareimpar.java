import java.util.Scanner;

public class Pareimpar {
    public static void main(String[] args) {
        
        System.out.println("escoge un numero cualquiera");
        Scanner dato=new Scanner(System.in);
        int datos=dato.nextInt();
        int suma1=0;
        int suma2=0;

        for(int i=0;i<=datos;i++){
        
            if(i % 2==0){
                System.out.println("par"+i);
                suma1= suma1 +i;
            }else if(i % 2 != 0){
                System.out.println("impar"+i);
                suma2=suma2+i;
            }
        } 
        System.out.println("suma de enteros es: "+suma1);
        System.out.println("suma de impares es: "+suma2);
    } 
}
