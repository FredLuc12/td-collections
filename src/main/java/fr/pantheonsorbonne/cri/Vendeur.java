package fr.pantheonsorbonne.cri;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Vendeur {

    public Collection<Viennoiserie> processOrder(Order order) {

        return null;
    }

    Set<Viennoiserie> viennoiserie = new TreeSet<Viennoiserie>(new Comparator<Viennoiserie>() {

        @Override
        public int compare(Viennoiserie o1, Viennoiserie o2) {

            return o1.getPoids().compareTo(o2.getPoids());
        }

    });

    public Vendeur(Set<Viennoiserie> viennoiserie) {
        this.viennoiserie = viennoiserie;
    }

    public static void main (String ...args){

        Vendeur v = new Vendeur(Sets.);
    }
}
