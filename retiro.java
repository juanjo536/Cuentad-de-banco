
package RetirodeCuenta;

import cuentas.CuentaAhorros;
import java.util.Scanner;


public class retiro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese el saldo inicial: $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.println("Ingrese tasa de interes: ");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta_1 = new
        CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.println("Ingrese cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuenta_1.consignar(cantidadDepositar);
        System.out.println("Ingrese cantidad a retirar: $");
        float cantidadRetirar = input.nextByte();
        cuenta_1.retirar(cantidadRetirar);
        cuenta_1.extractoMensual();
        cuenta_1.mostrarDatos();
    }
    
}
