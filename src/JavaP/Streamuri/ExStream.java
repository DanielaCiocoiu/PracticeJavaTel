package JavaP.Streamuri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExStream {

    public static void main(String[] args) {

        List<String> membri = new ArrayList<>();
        membri.add("Laurentiu");
        membri.add("Andrei");
        membri.add("Daniela");
        membri.add("Alexandra");
        membri.add("Catalina");
        membri.add("Teodor");
        membri.add("Mihaela");
        membri.add("Cristian");

        Predicate<String> stringPredicate  = nume -> nume.startsWith("A");

        //afisez membrii care incep cu a

/*        membri.stream()
                .filter(stringPredicate)  //sau direct   .filter(nume -> nume.startsWith("A"))
                .forEach(System.out::println); //sau s -> System.out.println(s)*/

        //afiseaza nr membrii care incep cu a


/*        long nr = membri.stream()
                .filter(stringPredicate)
                .count();
        System.out.println(nr);*/

        //afiseaza numele tuturor membrilor ordonati alfabetic si cu litere mari

  /*      membri.stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);*/


        //o lista cu valorile de la 1 la 9, generez o alta lista pe baza acestei liste cu valorile pare folosind Collectors

//Stocheza intr-o lista noua doar valorile pare din integerList

        List<Integer>integerList = Arrays.asList(1,2,3,4,5,6,8,9);

        List<Integer>nrPare = integerList.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());  //le stochez in lista, nu le afisez direct


       // System.out.println(nrPare);

//Afiseaza elementele pare din integerList
   /*     integerList.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        //pe baza listei de numere pare obtinute, stochez intr-o alta lista valorile ridicate la patrat

        List<Integer> nrLaPatrat = nrPare.stream()
                .map(x->x*x)
                .collect(Collectors.toList());

        System.out.println("Lista nrLaPatrat" + nrLaPatrat);






    }
}
