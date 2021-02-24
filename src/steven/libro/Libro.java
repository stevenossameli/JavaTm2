package steven.libro;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;

    private boolean prestado;



    public Libro(){}

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void prestamo(){
        System.out.println("El libro se ha prestado");
        this.prestado = true;
    }

    public void devolucion(){
        System.out.println("El libro se ha devuelto");
        this.prestado = false;
    }

    //ToString
    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}