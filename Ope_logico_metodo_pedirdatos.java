import java.util.Scanner;

public class Ope_logico_metodo_pedirdatos {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        System.out.println("nombre es:");
        String nombre=dato.nextLine();
        System.out.println(saludo(nombre));

    }

    //
    public static String saludo(String saludo){
        
        return "hola "+ saludo;
    }
}
