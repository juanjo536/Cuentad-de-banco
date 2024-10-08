
package cuentas;


public class Cuenta {
    protected float saldo;
    protected int numerodeConsignaciones = 0;
    protected int numerodeRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual;
    
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        this.numerodeConsignaciones = numerodeConsignaciones + 1;
    }
    
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo>=0){
            saldo -= cantidad;
            numerodeRetiros = numerodeRetiros + 1; 
    } else {
            System.out.println("Esta cantidad supera el saldo actual");
        }
    }
    
    public void calcularInteres(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteres();
        System.out.println("el saldo despues de comisiones e intereses: " + 
                saldo);
    }
    
}
