package steven.cuentacorriente;/*
Coded By Steven Ossa
 */

public class CuentaCorriente {

    private String numCuenta;
    private double saldo;
    private double gastos;
    private double saldoTotal;

    public CuentaCorriente(){
    }

    public CuentaCorriente(String numCuenta, double saldo, double gastos, double saldoTotal) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.gastos = gastos;
        this.saldoTotal = saldoTotal;
    }

    //constructor copia
    public CuentaCorriente(CuentaCorriente cuenta){
        this.numCuenta = cuenta.getNumCuenta();
        this.saldo = cuenta.getSaldo();
        this.gastos = cuenta.getGastos();
        this.saldoTotal = cuenta.getSaldoTotal();
    }


    public void ingreso(double monto){
       System.out.println("Registrando ingreso por valor de " + monto);
       this.saldo+=monto;
       this.saldoTotal+=monto;
    }

    public void egreso(double monto){
        System.out.println("Egreso por valor de " + monto);
        this.saldo-=monto;
        this.saldoTotal-=monto;
        this.gastos+=monto;
    }

    public void reintegro(double monto){
        System.out.println("Reintegro por valor de " + monto);
        this.saldo+=monto;
        this.saldoTotal+=monto;
        this.gastos-=monto;
    }

    public void transferencia(double monto, String numCuenta){
        System.out.println("Realizando transferencia a la cuenta " + numCuenta + " por valor de " + monto);
        this.saldo-=monto;
        this.saldoTotal-=monto;
        this.gastos+=monto;
    }

    // Getters && Setters


    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.setSaldoTotal(this.getSaldo());
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {

        this.saldoTotal = saldoTotal;
    }
}