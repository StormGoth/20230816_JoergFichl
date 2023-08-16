import java.time.LocalDate;
import java.time.Period;


public class Gruessen {
    private String firstname;
    private String lastname;
    private LocalDate bday;

    public Gruessen (String firstname, String lastname, LocalDate bday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bday = bday;
    }

    public String gruesse() {
        Period intervalPeriod = Period.between(bday, LocalDate.now());
        return "Hallo " + firstname + " " + lastname + ", Du bist heute " + intervalPeriod.getYears() + " Jahre alt.";
    }
}
