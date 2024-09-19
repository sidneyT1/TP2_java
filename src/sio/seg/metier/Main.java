package sio.seg.metier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Commune commune = new Commune(1, "Commune 1");


        commune.ajouteSecteur(1, "Secteur 1", true);
        commune.ajouteSecteur(2, "Secteur 2", false);

        Secteur secteur1 = commune.getSecteurByNumero(1);
        System.out.println("Secteur 1" + secteur1.getNom());


        ArrayList<Secteur> secteursEVerts = commune.secteursEVerts();
        System.out.println("espace vert :" + secteur1.isEspaceVert());

        Compteur compteur = new Compteur(1, 'A');

        compteur.releve(100);
        System.out.println("Consomm " + compteur.conso());

        secteur1.ajouteCompteur(compteur);

        ArrayList<Compteur> compteurs = secteur1.getLesCompteurs();


        System.out.println("Numéro secteur 1 " + secteur1.GetNum());
        System.out.println("Nom secteur 1" + secteur1.getNom());
        System.out.println("Espace vert du secteur  " + secteur1.isEspaceVert());
        System.out.println("Numéro du compteur " + compteur.GetNumero());
        System.out.println("Type du compteur " + compteur.getTypeCompteur());
        System.out.println("Volume distribué de la commune: " + commune.volumeDistribue('A'));
        System.out.println("Perte de la commune : " + commune.perte());
        System.out.println("Anomalie de la commune : " + commune.anomalie());
    }
}