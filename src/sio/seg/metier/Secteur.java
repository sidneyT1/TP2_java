
package sio.seg.metier;

import java.util.ArrayList;


public class Secteur {

    private int numSecteur;
    private String nomSecteur;
    private boolean espaceVert;
    private Commune laCommune;
    private ArrayList<Compteur> lesCompteurs;

    /**
     * Constructeur qui initialise le secteur avec un numéro, un nom, si c'est un espace vert et une commune.
     *
     * @param unNumero    le numéro du secteur
     * @param unNom       le nom du secteur
     * @param unEspaceVert si le secteur est un espace vert
     * @param uneCommune  la commune à laquelle le secteur appartient
     */
    public Secteur(int unNumero, String unNom, boolean unEspaceVert, Commune uneCommune) {
        this.numSecteur = unNumero;
        this.nomSecteur = unNom;
        this.espaceVert = unEspaceVert;
        this.laCommune = uneCommune;
        this.lesCompteurs = new ArrayList<>();
    }

    /**
     * Retourne le numéro du secteur.
     *
     * @return le numéro du secteur
     */
    public int GetNum() {
        return this.numSecteur;
    }

    /**
     * Retourne le nom du secteur.
     *
     * @return le nom du secteur
     */
    public String getNom() {
        return nomSecteur;
    }

    /**
     * Retourne si le secteur est un espace vert.
     *
     * @return si le secteur est un espace vert
     */
    public boolean isEspaceVert() {
        return this.espaceVert;
    }

    /**
     * Retourne les compteurs dans le secteur.
     *
     * @return les compteurs
     */
    public ArrayList<Compteur> getLesCompteurs() {
        return lesCompteurs;
    }

    /**
     * Ajoute un nouveau compteur au secteur.
     *
     * @param unCompteur le compteur à ajouter
     */
    public void ajouteCompteur(Compteur unCompteur) {
        this.lesCompteurs.add(unCompteur);
    }
}