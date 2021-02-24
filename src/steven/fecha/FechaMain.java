package steven.fecha;

import steven.fecha.Fecha;

public class FechaMain {
    public static void main(String[] args) {
        System.out.println("yyyy/mm/dd\n");
        //fecha
        Fecha f = new Fecha(2021, 2, 15);
        System.out.println(f);

        System.out.println("Sumando un día");
        f.sumarDia();
        System.out.println(f);

        int anio = 2000;
        int mes = 4;
        int diaMes = 21;

        System.out.println("\n¿es válida esta fecha: " + anio+ "/" +mes+ "/" + diaMes + "?");
        System.out.println(f.validarFecha(anio,mes,diaMes));



        anio = 1999;
        mes = -9;
        diaMes = 32;
        System.out.println("\n¿es válida esta fecha: " + anio+ "/" +mes+ "/" + diaMes + "?");
        System.out.println(f.validarFecha(anio,mes,diaMes));

        System.out.println("\nFecha actual : " + new Fecha());
    }
}
