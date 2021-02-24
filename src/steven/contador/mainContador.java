package steven.contador;

public class mainContador {
    public static void main(String[] args) {
        Contador contador = new Contador();

        System.out.println("Incrementando");
        contador.incrementar();
        System.out.println("Incrementando");
        contador.incrementar();
        System.out.println("Incrementando");
        contador.incrementar();
        System.out.println("Incrementando");
        contador.incrementar();

        System.out.println(contador.getCont());

        System.out.println("Decrementando");
        contador.decrementar();
        System.out.println(contador.getCont());

        System.out.println("\nNuevo contador");

        Contador contador2 = new Contador(5);
        System.out.println(contador2.getCont());

        System.out.println("Decrementando");
        contador2.decrementar();

        System.out.println("Decrementando");
        contador2.decrementar();

        System.out.println(contador2.getCont());

    }

}