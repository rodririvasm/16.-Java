import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        
        System.out.println("repetir ejercicicio digite 1=si o digite 0=no");
        Scanner digito=new Scanner(System.in);
        int repetir=digito.nextInt();
        
        do{
        
        System.out.println("ingrese dos numeros");
        System.out.println("ingrese el primer numero: ");
        Scanner dato=new Scanner(System.in);
        int numero=dato.nextInt();
        System.out.println("ingrese el segundo numero: ");
        Scanner dato1=new Scanner(System.in);
        int numero1=dato1.nextInt();

        while(numero < numero1){
            System.out.println("es menor");
            break;
        }
    }while(repetir==1);
}
}
