package JavaA.Cinematograf;

public class Animatii extends Film {

    public Animatii(String titlu, int minute) {
        super(titlu, minute);
    }

    public void dublareLimba() {
        System.out.println("Filmul este dublat in limba romana");
    }

    @Override
    public String toString() {
        return "Animatii " + " " + super.getId() + " " + super.getTitlu() + " " + super.getMinute();
    }
}
