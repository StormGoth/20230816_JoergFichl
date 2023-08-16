import java.time.LocalDate;

class Hello {

    public static void main(String[] args) {
        Gruessen gruss = new Gruessen("Jörg","fichl", LocalDate.of(1972, 8, 16));
        System.out.println(gruss.gruesse());
    }
}