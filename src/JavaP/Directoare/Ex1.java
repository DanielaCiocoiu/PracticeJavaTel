package JavaP.Directoare;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Creati urmatoarea structura de directoare:

director1
    |----director2
    |----director3
        |-----director 4
        -----fisierul_meu.txt

    1. In cadrul director3 creaza un fisier denumit fisierul_meu.txt. Daca fisierul exista deja, afisati un mesaj corespunzator
    Daca crearea fisierului se face cu succes scrieti mesajul "Am reusit sa scriu in fisiere cu Java"

    2. Stergeti fisierul fisierul_meu.txt

    3. Creati in director1 un fisier fisier_nou.txt astfel incat sa fie read-only

    4. Afiati tot continutul din director1.

    5. Afisati doar sub-directoarele din director1

    6. Scrieti o metoda recursiva pentru a stege continutul director1.
*/
public class Ex1 {
    public static void main(String[] args) throws IOException {
        String cale = "Director1/Director3/Director4/fisierul_meu.txt";

/*        Path path = Paths.get(cale );
        if (Files.exists(path)){
            System.out.println("Structura deja exista!");
        }else {
            Files.createDirectories(path);
        }

        File file = new File(cale);
        System.out.println(file.getAbsolutePath());*/

        //varianta File

    /*    File file = new File(cale);
        Path locatieCurenta = Paths.get(".");
        System.out.println(locatieCurenta.toAbsolutePath());*/

      /*  boolean succes  = file.mkdirs();

        if (succes){
            System.out.println("Fisier creat");
        }else {
            System.out.println("Structura deja exista!");
        }*/

        File fisier = new File(cale);

        FileWriter fileWriter = null;

        //varianta de try fara resurse de creere si scriere in fisier
/*        boolean succes = fisier.createNewFile();
        if (succes) {
            try {
                System.out.println("Am creat fisierul");
                fileWriter = new FileWriter(cale);
                fileWriter.write("Am scris in fisier");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }

        }*/

        //varianta de try cu resurse de creere si scriere in fisier
/*        boolean succes = fisier.createNewFile();
        if (succes) {
            try(FileWriter fileWriter = new FileWriter(cale)) {
                System.out.println("Am creat fisierul");

                fileWriter.write("Am scris in fisier");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        //sterg fisierul din Path
/*        boolean success = Files.deleteIfExists(fisier.toPath());
        if (success) {
            System.out.println("Ok, fisier sters");
        }*/

        //fisier readOnly
/*        fisier = new File("Director1/fisierReadOnly.txt");
        fisier.createNewFile();
        fisier.setReadOnly();*/


      //  5. Afisati doar sub-directoarele din director1
/*        Path locatie = Paths.get("Director1/");
        Files.walk(locatie, 2)
                .filter(path -> Files.isDirectory(path) && !path.equals(locatie))//afisez mai putin directorul1 sau cel original
                .forEach(System.out::println);*/

      //apel sterge recursiv
      stergeRecursiv(new File("Director1/"));

    }

   // 6. Scrieti o metoda recursiva pentru a stege continutul director1.
    public static boolean stergeRecursiv(File director){
     //
     File [] continutDiretoare = director.listFiles();
     if (continutDiretoare != null){
      for (File file : continutDiretoare){
          stergeRecursiv(file);
      }
     }
     return director.delete();
    }


}
