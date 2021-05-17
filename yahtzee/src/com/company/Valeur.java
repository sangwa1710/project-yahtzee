package com.company;

public class Valeur {
    protected int valeur;

    public int getValeur() {
        return valeur;
    }

   public int compareTO(Valeur valeur){
       if (this.valeur== valeur.valeur) {
           return 0;
       }
       if (this.valeur> valeur.valeur) {
           return 1;
       }

       return -1;


   }
}
