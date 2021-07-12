import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        cuentaBancaria cuenta_personal=new cuentaBancaria();
        cuentaBancaria cuenta_papa=new cuentaBancaria();
        System.out.println("digite el monto a depositar: ");
        Scanner leer=new Scanner(System.in);
        float deposito=leer.nextFloat();
        cuenta_personal.depositos(deposito);
        
        cuenta_personal.beneficiario="rodrigo";
        System.out.println(cuenta_personal.beneficiario);

        System.out.println("ingrese el monto a  retirar:");
        float retiro=leer.nextFloat();

        cuenta_personal.depositos(deposito);
        cuenta_personal.retiros(retiro);
        System.out.println("tu saldo actual es:"+cuenta_personal.consultarSaldo());

        

        cuenta_papa.beneficiario="karla";
        System.out.println(cuenta_papa.beneficiario);


    }
}
