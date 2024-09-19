package sio.seg.metier;

import java.util.ArrayList;

public class Secteur
{
    private int numSecteur;
    private String nomSecteur;
    private boolean espaceVert;
    private Commune laCommune;
    private ArrayList<Compteur> lesCompteurs;

    public Secteur(int unNumero, String unNom, boolean unEspaceVert, Commune uneCommune)
    {
        this.numSecteur = unNumero;
        this.nomSecteur = unNom;
        this.espaceVert = unEspaceVert;
        this.laCommune = uneCommune;
    }

    public int GetNum()
    {
        return this.numSecteur;
    }

    public String getNom()
    {
        return nomSecteur;
    }

    public boolean isEspaceVert()
    {

        return this.espaceVert;

    }

    public ArrayList<Compteur> getLesCompteurs()
    {
        return lesCompteurs;
    }

    public void ajouteCompteur(Compteur unCompteur)
    {
        this.lesCompteurs.add(unCompteur);
    }
}
