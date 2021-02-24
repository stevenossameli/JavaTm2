package steven.fraccion;

public class FraccionMain {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2,3);
        Fraccion f2 = new Fraccion(1,3);

        //sumar
        System.out.println("sumando " + f1 + " + " + f2);
        System.out.println(f1.sumar(f2));

        //restar
        System.out.println("restando " + f1 + " - " + f2);
        System.out.println(f1.restar(f2));

        //multiplicar
        System.out.println("multiplicando " + f1 + " * " + f2);
        System.out.println(f1.multiplicar(f2));

        //dividir
        System.out.println("dividiendo " + f1 + " / " + f2);
        System.out.println(f1.dividir(f2));

        // Sobrecarga de métodos

        System.out.println("-----Sobrecarga de métodos-----");

        int valorEntero = 5;


        //sumar
        System.out.println("sumando " + f1 + " + " + valorEntero);
        System.out.println(f1.sumar(valorEntero));

        //restar
        System.out.println("restando " + f1 + " - " + valorEntero);
        System.out.println(f1.restar(valorEntero));

        //multiplicar
        System.out.println("multiplicando " + f1 + " * " + valorEntero);
        System.out.println(f1.multiplicar(valorEntero));

        //dividir
        System.out.println("dividiendo " + f1 + " / " + valorEntero);
        System.out.println(f1.dividir(valorEntero));

    }
}
