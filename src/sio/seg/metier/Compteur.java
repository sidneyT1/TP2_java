package sio.seg.metier;

public class Compteur
{
   private int numero;
   private char typeCompteur;
   private int indexPrecedent;
   private int indexNouveau;

   public Compteur(int unNumero, char unType)
   {
      this.numero = unNumero;
      this.typeCompteur = unType;
      this.indexPrecedent = 0;
      this.indexNouveau = 0;
   }

   public void releve(int indexReleve)
   {
      this.indexPrecedent = this.indexNouveau;
      this.indexNouveau = indexReleve;
   }
   public int GetNumero()
   {
      return this.numero;
   }
   public char getTypeCompteur()
   {
      return this.typeCompteur;
   }

   public int conso()
   {
      return this.indexNouveau - this.indexPrecedent;

   }




}

