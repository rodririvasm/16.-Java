import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        
        System.out.println("digite los angulos del trinagulo a realizar: ");
        System.out.println("primer angulo");
        Scanner primer=new Scanner(System.in);
        int angulo1=primer.nextInt();
        System.out.println("segundo angulo");
        Scanner segundo=new Scanner(System.in);
        int angulo2=segundo.nextInt();
        System.out.println("tercer angulo");
        Scanner tercero=new Scanner(System.in);
        int angulo3=tercero.nextInt();

        if(angulo1<=90 && angulo2<=90 && angulo3<=90){
            System.out.println("los trinagulos son validos");
        }else{
            System.out.println("uno o varios de los angulos no son validos");
        }

    }
}
