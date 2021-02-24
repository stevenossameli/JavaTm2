package steven.cuentacorriente;
public class CuentaCorrienteMain {

    public static void main(String[] args) {
        CuentaCorriente masterCard = new CuentaCorriente();
        masterCard.setNumCuenta("783158789541530");

        System.out.println("\n------Cuenta Corriente No " + masterCard.getNumCuenta() +"------\n");
        masterCard.setSaldo(1000);
        imprimirSaldoTotal(masterCard);

        masterCard.transferencia(300, "9942949502943294");
        imprimirSaldoTotal(masterCard);

        masterCard.egreso(250);
        imprimirSaldoTotal(masterCard);

        masterCard.ingreso(150);
        imprimirSaldoTotal(masterCard);

        masterCard.reintegro(300);
        imprimirSaldoTotal(masterCard);

        System.out.println("Total gastos");
        System.out.println("$" + masterCard.getGastos());


        // Creando copia de la cuenta corriente
        CuentaCorriente copia = new CuentaCorriente(masterCard);

        System.out.println("------Copia de la cuenta No " + masterCard.getNumCuenta() + "-----");
        imprimirSaldoTotal(copia);

    }

    public static void imprimirSaldoTotal(CuentaCorriente c){
        System.out.print("Saldo total: ");
        System.out.println("$" + c.getSaldoTotal()+"\n");
    }
}