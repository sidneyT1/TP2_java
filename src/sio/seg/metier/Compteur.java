
package sio.seg.metier;


public class Compteur {
   private int numero;
   private char typeCompteur;
   private int indexPrecedent;
   private int indexNouveau;

   /**
    * Constructeur qui initialise le compteur avec un numéro et un type.
    *
    * @param unNumero le numéro du compteur
    * @param unType   le type de compteur
    */
   public Compteur(int unNumero, char unType) {
      this.numero = unNumero;
      this.typeCompteur = unType;
      this.indexPrecedent = 0;
      this.indexNouveau = 0;
   }

   /**
    * Effectue un relevé du compteur avec un nouvel index.
    *
    * @param indexReleve le nouvel index du compteur
    */
   public void releve(int indexReleve) {
      this.indexPrecedent = this.indexNouveau;
      this.indexNouveau = indexReleve;
   }

   /**
    * Retourne le numéro du compteur.
    *
    * @return le numéro du compteur
    */
   public int GetNumero() {
      return this.numero;
   }

   /**
    * Retourne le type de compteur.
    *
    * @return le type de compteur
    */
   public char getTypeCompteur() {
      return this.typeCompteur;
   }

   /**
    * Retourne la consommation du compteur.
    *
    * @return la consommation du compteur
    */
   public int conso() {
      return this.indexNouveau - this.indexPrecedent;
   }
}