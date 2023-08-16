public class Gruessen {
    private String name; 

    public Gruessen (String name) {
        this.name = name;
    }

    public String gruesse() {
        return "Hallo " + name + ", was ein toller Tag für etwas Java und Git. 😊";
    }
}
