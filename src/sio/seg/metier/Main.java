package sio.seg.metier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Compteur C1 = new Compteur (5, 'A');



        C1.releve(100);
        System.out.println(C1.conso());

        Secteur S1 = new Secteur(1, "1", true, null);
        Secteur S2 = new Secteur(1, "1", true, null);





        S1.GetNum();
        System.out.println(S1);


    }
}
