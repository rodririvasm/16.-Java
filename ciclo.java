import java.util.Scanner;

public class ciclo {
    public static void main(String[] args) {
        
        System.out.println("ingrese el numero de la tabla de multiplicar que quiera visualizar");
        Scanner dato=new Scanner(System.in);
        int tabla=dato.nextInt();  
        ciclofor(tabla); 
    }

    public static void ciclofor(int tabla){
        for(int i=1;i<=10;i++){
            System.out.println(tabla+"x"+i+"="+tabla*i);
        }
        
    }
}
