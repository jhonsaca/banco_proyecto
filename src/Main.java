import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double total_balance = 1599.99;
    public static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
    //Variables
        String client_name = "Andrew Quezada";
        String account_type= "Corriente";

        System.out.println("Bienvenido a nuestro programa.");
        System.out.println("Nombre de cliente: " + client_name);
        System.out.println("Tipo de cuenta: " + account_type);
        System.out.println("Su saldo total es: " + total_balance + "$");
        menu();
    }

    public static void menu(){

        int choice;
        System.out.println("Que operación desea realizar?");
        System.out.println("1. Consultar su saldo");
        System.out.println("2. Retiro");
        System.out.println("3. Depósito");
        System.out.println("9. Salir");
        choice = entry.nextInt();
        seleccion(choice);
    }

    public  static void seleccion(int respuesta){
        switch (respuesta){
            case 1:
                System.out.println("Su saldo es: " + total_balance + "$");
                menu();
                break;
            case 2:
                System.out.println("Ingrese la cantidad a retirar");
                double retiro = entry.nextDouble();
                if (retiro<total_balance){
                    System.out.println("Retiro realizado con éxito!");
                    total_balance-=retiro;
                    System.out.println("Saldo actualizado: "+ total_balance+"$");
                    menu();
                }else {
                    System.out.println("Saldo insuficiente para realizar la transacción");
                    menu();
                }
                break;
            case 3:
                System.out.println("Ingrese el monto a depositar: ");
                double deposito = entry.nextDouble();
                total_balance+=deposito;
                System.out.println("Transaccion realizada con éxito");
                System.out.println("Saldo actualizado: "+ total_balance+"$");
                menu();
                break;
            case 9:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            default:
                System.out.println("Opción inválida. Ingrese la opción que corresponda.");
                menu();
                break;
        }
    }
}