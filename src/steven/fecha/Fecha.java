package steven.fecha;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    Calendar calendar;

    public Fecha(){
        this.calendar = GregorianCalendar.getInstance();
    }

    public Fecha(int year, int month, int dayOfMonth){

        if(validarFecha(year, month, dayOfMonth)){

            this.calendar = new GregorianCalendar(year, (month-1), dayOfMonth);
        }

    }


    public boolean validarFecha(int year, int month, int dayOfMonth){

        try {
            LocalDate ld = LocalDate.of( year , month , dayOfMonth ) ;
            return true ;
        } catch ( DateTimeException e ) {
            System.out.println("fecha no valida: "  + e.getMessage());
            return false;
        }
    }

    public void sumarDia(){
        calendar.add(Calendar.DAY_OF_MONTH, 1);
    }


    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return ""
                + calendar.get(Calendar.YEAR)
                + "/" + (calendar.get(Calendar.MONTH) + 1)
                + "/" + calendar.get(Calendar.DAY_OF_MONTH);
    }
}


