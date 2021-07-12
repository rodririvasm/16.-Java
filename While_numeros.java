import java.util.Scanner;

public class While_numeros {
    public static void main(String[] args) {
        
        System.out.println("ingrese dos numeros");
        System.out.println("ingrese el primer numero: ");
        Scanner dato=new Scanner(System.in);
        int numero=dato.nextInt();
        System.out.println("ingrese el segundo numero: ");
        Scanner dato1=new Scanner(System.in);
        int numero1=dato1.nextInt();

        while(numero < numero1){

            System.out.println("ingrese el primer numero: ");
            numero=dato.nextInt();
            System.out.println("ingrese el primer numero: ");
            numero1=dato1.nextInt();
        }
    }
}
