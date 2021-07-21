package Ex2Fisier;
/*In metoda main a clasei DemoFisier, sa se creeze un vector de cel putin 5 fisiere diferite. Din acest vector, se vor
        salva doar fisierele cu dimensiune mai mica de 800. Se va afisa, apeland salveaza() din instantele de fisiere,
        mesajul urmator, pentru toate fisierele salvate:

        Fisierul <tip> “<nume.extensie>” a fost salvat.

        Exemplu: Fisierul pdf “Document1.pdf” a fost salvat

        Fisierul word “Document2.docx” a fost salvat

        Fisierul executabil “Document3.exe” a fost salvat*/

public class DemoFisier {

    public static void main(String[] args) {

        Pdf pdf = new Pdf("Pdf", 10);
        Pdf pdf1 = new Pdf("Pdf1", 1900);
        Word word = new Word("Doc", 500);
        Word word1 = new Word("Doc1", 860);

        Fisier[] fisier = {pdf, pdf1, word, word1};
        for (Fisier fis : fisier) {

            fis.salveaza();
        }


    }
}
