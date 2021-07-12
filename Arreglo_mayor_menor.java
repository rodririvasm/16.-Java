import java.util.Scanner;

public class Arreglo_mayor_menor {
     public static void main(String[] args) {
         
        System.out.println("ingrese sus notas a continuacion,presione el numero 5:");
        Scanner notas=new Scanner(System.in);
        int nota_arreglo=notas.nextInt();
        double nota[]=new double[nota_arreglo];

        System.out.println("1.-matematicas");
        System.out.println("2.-quimica");
        System.out.println("3.-fisica");
        System.out.println("4.-telecomunicaciones");
        System.out.println("5.-programacion");


        
        for(int i=0;i<nota.length;i++){
            
            System.out.println("digite la calificacion de la materia "+(i+1)+" :");
            
            Scanner notas_for=new Scanner(System.in);
            double nota_arreglo_for=notas_for.nextDouble();
            do{
            if(nota_arreglo_for<=10){
            nota[i]=nota_arreglo_for;
            }else{
                System.out.println("vuelva a intentarlo");
            }
        }while(nota_arreglo<=10);
        }
        
        

     }
}
