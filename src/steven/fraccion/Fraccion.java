package steven.fraccion;

public class Fraccion {
    private int num;
    private int den;

    public Fraccion() {
        this.num = 0;
        this.den = 1;
    }

    public Fraccion(int num, int den) {
        this.num = num;
        if(den==0){
            den = 1;
        }
        this.den = den;
        simplificar();
    }

    public Fraccion(int num) {
        this.num = num;
        this.den = 1;
    }


    //sumar fracciones
    public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }


    // sobrecarga sumar
    public Fraccion sumar(int n){
       Fraccion entero = new Fraccion(n);
       return this.sumar(entero);
    }


    //restar fracciones
    public Fraccion restar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.den - this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }

    // sobrecarga restar
    public Fraccion restar(int n){
        Fraccion entero = new Fraccion(n);
        return this.sumar(entero);
    }

    //multiplicar fracciones
    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }

    //sobrecarga multiplicar
    public Fraccion multiplicar(int n){
        Fraccion entero = new Fraccion(n);
        return this.multiplicar(entero);
    }

    //dividir fracciones
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }

    // sobrecarga dividir
    public Fraccion dividir(int n){
        Fraccion entero = new Fraccion(n);
        return this.multiplicar(n);
    }

    //Cálculo del máximo común divisor por el algoritmo de Euclides
    private int mcd() {
        int u = Math.abs(num); //valor absoluto del numerador
        int v = Math.abs(den); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //método para simplificar fracciones
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        num = num / n;
        den = den / n;
    }


    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }
}