package steven.contador;/*
Coded By Steven Ossa
 */

public class Contador {
    private int cont;

    //constructor por defecto
    public Contador() {

    }

    //constructor con parámetros
    public Contador(int cont) {
        if(cont < 0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }

    //constructor copia
    public Contador(final Contador copia){
        this.cont = copia.getCont();
    }

    public void incrementar(){
        this.cont++;
    }

    public void decrementar(){
        this.cont--;
        if(cont<0){
            this.cont = 0;
        }
    }


    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
