package Ceas;

public class Ceas {

    private int ore;
    private int minute;
    private int secunde;

    //ctor fara parametri (initializeaza atributele astfel incat ora sa fie 12:0:0)
    public Ceas() {
        this(12, 0, 0);
    }

    //ctor  cu 3 parametri (ore, minute, secunde)
    public Ceas(int ore, int minute, int secunde) {
        this.ore = ore;
        this.minute = minute;
        this.secunde = secunde;
    }
//ctor cu 1 parametru (secunde care vor fi transformate in ore minute si secunde pentru a initializa atributele)

    public Ceas(int secunde) {
        this.ore = secunde / (60 * 60);
        this.minute = (secunde - (this.ore * 60 * 60)) / 60;
        this.secunde = (secunde - (this.ore * 60 * 60)) % 60;
    }

    public int getOre() {
        return ore;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecunde() {
        return secunde;
    }

/* adaugaCeas, va primi ca parametru un obiect de tip Ceas si va aduna orele, minutele si secundele instantei curente
cu cele ale parametrului, returnand un obiect de tip Ceas  in care se salveaza rezultatul adunarii*/
    public Ceas adaugaCeas(Ceas param) {
        int tempSecunde = this.secunde + param.secunde;
        int tempMinute = this.minute + param.minute;
        int tempOre = this.ore + param.ore;

        if (tempSecunde > 59) {
            tempSecunde = tempSecunde - 60;
            tempMinute = tempMinute + 1;
            if (tempMinute > 59) {
                tempMinute = tempMinute - 60;
                tempOre = tempOre + 1;
            }
        }
        Ceas result = new Ceas(tempOre, tempMinute, tempSecunde);
        return result;
    }
//daugaSecunda, metoda fara parametri care adauga o secunda la secundele instantei curente
// (modificand si minutele si orele, daca este cazul)
    public void adaugaSecunda() {
        ++this.secunde;
        if (this.secunde == 60) {
            this.secunde = 0;
            ++this.minute;
            if (this.minute == 60) {
                this.minute = 0;
                ++this.ore;
                if (this.ore >= 24) {
                    this.ore = 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Ceasul arata: " + this.ore +
                ":" + this.minute +
                ":" + this.secunde;
    }

}
