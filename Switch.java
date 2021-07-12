import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Quiere hacer una operacion,digite 1 igual a 'si' y  0 igual a'no'");
        Scanner desicion= new Scanner(System.in);
        int respuesta=desicion.nextInt();
    do{
        System.out.println("digite el numero de la operacion a realizar: ");
        System.out.println("1.-suma");
        System.out.println("2.-resta");
        System.out.println("3.-multiplicacion");
        System.out.println("4.-division");
        Scanner operacion= new Scanner(System.in);
        int datooperacion=operacion.nextInt();
        System.out.println("ahora digite los dos numeros que quiera:");
        System.out.println("ingresa el valor del primer numero: ");
        Scanner dato=new Scanner(System.in);
        int numero1=dato.nextInt();
        System.out.println("ingresa el valor del segundo numero: ");
        Scanner dato1 =new Scanner(System.in);
        int numero2=dato1.nextInt();
        
    switch(datooperacion){
            case 1:
                   int suma=numero1+numero2;
                   System.out.println("la suma es: "+ suma);
                   break;
            case 2:
                   int resta=numero1-numero2;
                   System.out.println("la resta es: "+ resta);
                   break;
            case 3:
                  int multiplicacion=numero1*numero2;
                  System.out.println("la multiplicacion es: "+ multiplicacion);
                  break; 
            case 4:
                  int division=numero1/numero2;
                  System.out.println("la division es: "+ division);
                  break;

            default:
                    System.out.println("numero de opracion no valido");
                    break;
        } 
}while(respuesta == 1);
}
}



