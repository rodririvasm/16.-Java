import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        System.out.println("¿que edad tines?");
        Scanner dato=new Scanner(System.in);
        int edad=dato.nextInt();

        if(edad >= 18 & edad <=29){
            System.out.println("Tienes derecho a entrar a generation,"+mensaje(edad));
        }else{
            System.out.println("Lo sentimos no cumples con la edad,"+mensaje(edad));
        }
    }

    public static String mensaje(int mensaje){
        return "\n Tu edad es: "+mensaje;
    }
}
