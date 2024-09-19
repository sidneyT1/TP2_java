package sio.seg.metier;

import java.util.ArrayList;

public class Commune
{
    private int numCom;
    private String nomCom;
    private ArrayList<Secteur> lesSecteurs;

    public Commune(int unNumero, String unNom)
    {
        this.numCom = unNumero;
        this.nomCom = unNom;
    }

    public void ajouteSecteur(int unNumeroSecteur, String unNomSecteur, boolean unEspaceVert)
    {
        this.lesSecteurs.add(new Secteur(unNumeroSecteur, unNomSecteur, unEspaceVert, this));
    }

    public Secteur getSecteurByNumero(int unNumero)
    {
        for (Secteur secteur : lesSecteurs) {
            if (secteur.GetNum() == unNumero) {
                return secteur;
            }
        }
        return null;
    }

    public ArrayList<Secteur> secteursEVerts()
    {
        ArrayList<Secteur> secteursEVerts = new ArrayList<>();
        for (Secteur secteur : lesSecteurs) {
            if (secteur.isEspaceVert())
            {
                secteursEVerts.add(secteur);
            }
        }
        return secteursEVerts;
    }

}
