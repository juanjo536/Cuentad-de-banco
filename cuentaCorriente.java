package cuentas;

public class cuentaCorriente extends Cuenta {

    float sobregiro;

    public cuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }

    public void retirar(float cantidad) {
        float resultado = saldo = saldo - cantidad;
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        if (sobregiro > 0) {
            if (residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }

    }
    
    public void extractoMesual() {
        super.extractoMensual();
    }
    
    public void mostrarDatos() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Cargo mensual: $ " + comisionMensual);
        System.out.println("Numero de transacciones:" + (numerodeConsignaciones
                + numerodeRetiros));
        System.out.println("valor de sobregiro; $" + (numerodeConsignaciones 
                + numerodeRetiros));
        System.out.println();
    }
}
