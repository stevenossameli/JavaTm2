package steven.libro;

public class LibroMain {
    public static void main(String[] args) {
        Libro harryPotter = new Libro(
                "Harry Potter and the goblet of fire",
                "9780439139601",
                "J.k Rowling");

        System.out.println("\n" + harryPotter + "\n");

        System.out.println("Prestando libro");
        harryPotter.prestamo();

        System.out.println("¿El libro esta prestado?: " + harryPotter.isPrestado());

        System.out.println("\nDevolviendo libro");
        harryPotter.devolucion();

        System.out.println("¿El libro esta prestado?: " + harryPotter.isPrestado());

       System.out.println("\n" + harryPotter + "\n");

    }
}
