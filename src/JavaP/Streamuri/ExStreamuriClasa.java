package JavaP.Streamuri;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/* Afiseaza doar pisicile a caror nume incepe cu litera M
         2. Afiseaza o lista ce contine toate pisicile cu greutate peste 5
         3. Aduna si afiseaza toate greutatile pisicilor
         4. Afiseaza prima pisica cu greutate peste 4kg din lista definita anterior

         Dupa cum observi, cerintele pe care le-am enuntat nu sunt foarte diferite fata de ce am lucrat
         impreuna - diferenta mare vine din faptul ca aici lucram cu instante ale unei clase definite de noi,
         nu doar cu tipuri de date primitive ale limbajului.*/


public class ExStreamuriClasa {
    public static void main(String[] args) {

        List<Pisica> pisici = Arrays.asList(
                new Pisica("Leia", 5, 5.6),
                new Pisica("Sheba", 4, 5.9),
                new Pisica("Mini", 1, 3.5),
                new Pisica("Misha", 1, 6.5),
                new Pisica("Miti", 1, 4.5),
                new Pisica("Terra", 2, 4.7),
                new Pisica("Tom", 17, 4.8)
        );
        //genereaza o lista si afiseaz-o. Lista va contine doar pisicile cu greutate peste 5
        List<Pisica> pisiciObeze = pisici.stream()
                .filter(p -> p.getGreutate() > 5)//in cazul obiectelor adaptez operatia pe atribut p -> p.getGreutate() > 5
                .collect(Collectors.toList());
        System.out.println("Pisici cu greutate peste 5: ");
        System.out.println(pisiciObeze);

                Double sum =
                pisici.stream()
                        .map(p -> p.getGreutate())
                        .reduce((double) 0, (a, b) -> a + b);
        System.out.println("Greutatea totala a pisicilor este: " + sum);

        List<Pisica> pisiciObeze1 = pisici.stream()
                .filter(p -> p.getGreutate()>4)
        .collect(Collectors.toList());
        System.out.println("prima pisica cu greutate peste 4 kg: ");
        System.out.println(pisiciObeze1);

    }

}
