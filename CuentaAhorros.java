
package cuentas;


public class CuentaAhorros extends Cuenta {
    
    private boolean activa;
    
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo>10000) {
            activa = true;
        } else {
            activa = false;
        }
    }
    
    @Override
    public void retirar(float cantidad) {
        if (activa){
            super.retirar(cantidad);
        }
    }
    
    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }
    @Override
    public void extractoMensual(){
        if (numerodeRetiros < 4) {
            comisionMensual += (numerodeRetiros - 4) * 1000;
        }
        super.extractoMensual();
        
        if(saldo < 10000) {
            activa = false;
        }
    }
    public void mostrarDatos() {
        
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Numero de transacciones:" + (numerodeConsignaciones
                + numerodeRetiros));
        System.out.println();
    }
}
