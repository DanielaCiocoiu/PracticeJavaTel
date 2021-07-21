package StranutException;

public class DemoOm {

    public static void main(String[] args) throws StranutException {
      /*    In metoda main din clasa DemoStranut, sa se creeze o instanta de Om
    si una de Bunic si sa se apeleze pentru fiecare metoda vorbeste pentru o fraza
            (un array de cuvinte, dintre care un cuvant este “hapciu”).

    Exemplu rezultat pentru om:
    Ana spune
    Buna
    ziua
    ce
    mai
    Ana a stranutat
    faceti*/
        Om om = new Om("Ana");
        try {
            om.vorbeste(new String[]{"1 Om Buna", "ziua", "ce", "mai", "hapciu", "faceti" });
        } catch (StranutException e) {
            e.printStackTrace();
        }
        Bunic bunic = new Bunic("Marian");
        bunic.vorbeste(new String[]{"2 Bunic Buna", "ziua", "ce", "mai", "hapciu", "faceti"});
    }

}
