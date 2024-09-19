
package sio.seg.metier;

import java.util.ArrayList;


public class Commune
{
    private int numCom;
    private String nomCom;

    private ArrayList<Secteur> lesSecteurs;

    /**
     * Constructeur qui initialise la commune avec un numéro et un nom.
     *
     * @param unNumero le numéro de la commune
     * @param unNom    le nom de la commune
     */
    public Commune(int unNumero, String unNom) {
        this.numCom = unNumero;
        this.nomCom = unNom;
        this.lesSecteurs = new ArrayList<>();
    }

    /**
     * Ajoute un nouveau secteur à la commune.
     *
     * @param unNumeroSecteur le numéro du secteur
     * @param unNomSecteur    le nom du secteur
     * @param unEspaceVert    si le secteur est un espace vert
     */
    public void ajouteSecteur(int unNumeroSecteur, String unNomSecteur, boolean unEspaceVert) {
        this.lesSecteurs.add(new Secteur(unNumeroSecteur, unNomSecteur, unEspaceVert, this));
    }

    /**
     * Retourne un secteur par son numéro, ou null si non trouvé.
     *
     * @param unNumero le numéro du secteur
     * @return le secteur, ou null si non trouvé
     */
    public Secteur getSecteurByNumero(int unNumero) {
        for (Secteur secteur : lesSecteurs) {
            if (secteur.GetNum() == unNumero) {
                return secteur;
            }
        }
        return null;
    }

    /**
     * Retourne une liste d'ArrayList de secteurs qui sont des espaces verts.
     *
     * @return la liste d'ArrayList de secteurs verts
     */
    public ArrayList<Secteur> secteursEVerts() {
        ArrayList<Secteur> secteursEVerts = new ArrayList<>();
        for (Secteur secteur : lesSecteurs) {
            if (secteur.isEspaceVert()) {
                secteursEVerts.add(secteur);
            }
        }
        return secteursEVerts;
    }

    /**
     * Calcule le volume total d'un type spécifique de compteur.
     *
     * @param unTypeCompteur le type de compteur
     * @return le volume total
     */
    public int volumeDistribue(char unTypeCompteur) {
        int volume = 0;
        for (Secteur secteur : lesSecteurs) {
            for (Compteur compteur : secteur.getLesCompteurs()) {
                if (compteur.getTypeCompteur() == unTypeCompteur) {
                    volume += compteur.conso();
                }
            }
        }
        return volume;
    }

    /**
     * Calcule la perte entre le volume total des compteurs 'V' et 'A'.
     *
     * @return la perte
     */
    public int perte() {
        int volumeTotalVannes = volumeDistribue('V');
        int volumeTotalAbonnés = volumeDistribue('A');
        return volumeTotalVannes - volumeTotalAbonnés;
    }

    /**
     * Calcule le niveau d'anomalie en fonction de la perte en pourcentage.
     *
     * @return le niveau d'anomalie
     */
    public int anomalie() {
        int volumeTotalVannes = volumeDistribue('V');
        int volumeTotalAbonnés = volumeDistribue('A');
        int perte = volumeTotalVannes - volumeTotalAbonnés;
        double pourcentagePerte = (double) perte / volumeTotalVannes * 100;
        if (pourcentagePerte < 10) {
            return 1;
        } else if (pourcentagePerte >= 10 && pourcentagePerte <= 15) {
            return 2;
        } else {
            return 3;
        }
    }
}