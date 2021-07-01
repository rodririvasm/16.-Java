import java.util.Scanner;

public class Operadores_logicos {
    // todo auto-generated method stub
    /*
    *operadores logicos
    *a==b a es igual b
    *a>b a es mayor a b
    *a<b a es menor a a
    *a!= a es diferente a b
    *>= o <= mayor que o menor que
    * / division 7
    */
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner numero=new Scanner(System.in);
        System.out.println("ingrese un numero");
        Scanner numero1=new Scanner(System.in);
        int a=numero.nextInt();
        int b=numero1.nextInt();
        System.out.println("ingrese un numero");
        Scanner numero3=new Scanner(System.in);
        System.out.println("ingrese un numero");
        Scanner numero4=new Scanner(System.in);
        int c=numero3.nextInt();
        int d=numero4.nextInt();

        if(a == b){
            System.out.println(a+" es diferente a "+b);
        }else if(a > b){
            System.out.println(a+" es mayor a "+b);
        }else{
            System.out.println(a+" es menor a "+b);
        }

        
        if(c == d){
            System.out.println(c+" es igual a "+d);
        }else if(c >= d){
            System.out.println(c+" es mayor que "+d);
        }else if(c <= d){
            System.out.println(c+" es menor que "+d);
        }
        else{
            System.out.println("Operador no encontrado");  
        }
    }
}
