/*3. Sa se defineasca urmatoarele clase: Profesor, ProfesorFizica, ProfesorMate,
        ProfesorEngleza, ProfesorFilozofie stabilind relatiile corecte intre acestea.

        Clasa Profesor va avea atributele: nume, experienta, profil (uman sau real).

        In metoda main a clasei DemoProfesor, se va atribui un obiect de tip profesor
        specific unei referinte de tip Profesor (Profesor p = new ProfesorFizica();)

        Daca profesorul este specializat intr-un profil uman, consideram ca este vorba
        de o doamna profesor, iar daca este specializat intr-un profil real,
        consideram ca este un domn profesor.

        In functie de tipul obiectului referentiat de referinta p, sa se afiseze urmatorul mesaj:
        Buna ziua, <domnule/doamna> profesor de <materie>, <nume>!

        Exemplu: Buna ziua, doamnule profesor de fizica, Ionescu!*/
package Profesor;

import java.util.Properties;

public class DemoProfesor {
    public static void main(String[] args) {
        Profesor p = new ProfesorFizica("Popescu", 9);
        System.out.println(p);           //- in acest context fara toString

        Profesor p1 = new ProfesorMate("Paul", 8);
        System.out.println(p1.toString());
        Profesor p2 = new ProfesorEngleza("Irina", 5);
        System.out.println(p2.toString());
        Profesor p3 = new ProfesorFilozofie("Maia", 5);
        System.out.println(p3.toString());
        Profesor p4  = new ProfesorFizica("Irinel", 3 );
        System.out.println(p4);
    }
}