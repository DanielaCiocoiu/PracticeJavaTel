package Cinematograf;

import java.util.Objects;

public abstract class Film {

    private String titlu;
    private int minute;
    private int id;
    private static int _curent_id = 1;//incrementare automata, fara sa dau un parametru, plec de la o val predefinita de 1

    public Film(String titlu, int minute) {
        this.titlu = titlu;
        this.minute = minute;
        this.id = Film._curent_id;
        Film._curent_id++;
    }

    public String getTitlu() {
        return this.titlu;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return minute == film.minute && id == film.id && Objects.equals(titlu, film.titlu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titlu, minute, id);
    }

    @Override
    public String toString() {
        return "Film{" +
                "titlu='" + titlu + '\'' +
                ", minute=" + minute +
                ", id=" + id +
                '}';
    }
}
