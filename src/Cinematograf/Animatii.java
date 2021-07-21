package Cinematograf;

public class Animatii extends Film {

    public Animatii(int id, String titlu, int minute) {
        super(id, titlu, minute);
    }

    public void dublareLimba() {
        System.out.println("Filmul este dublat in limba romana");
    }

    @Override
    public String toString() {
        return "Animatii " + " " + super.getTitlu() + " " + super.getMinute();
    }
}
