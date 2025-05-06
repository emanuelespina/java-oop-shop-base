package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    /*codice (numero intero)
    nome
    descrizione
    prezzo
    iva */

    // VARIABILI DI ISTANZA   
    
    Random randomGenerator = new Random();

    public int codice = randomGenerator.nextInt(10);
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;  

    String codiceProvvisorio;    
        
    // for (int i = 0; i < 10 ; i++){
    //    codiceProvvisorio.charAt(i) = randomGenerator.nextInt(10);
    // };

    // METODI

    public void priceChange (double price){
        prezzo = price;
    };

    public void ivaChange (double iva){
        this.iva = iva;
    };

    public String finalPrice (){
        return String.format("%.2f",prezzo + (prezzo * iva)/100);
    };

    public String extendedName (){
        return codice + "-" + nome; 
    };    

}
