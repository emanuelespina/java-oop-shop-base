package org.lessons.java.shop;
public class Main {
    public static void main(String[] args) throws Exception {

        Prodotto tablet = new Prodotto();

        tablet.nome = "TabS9";

        System.out.println(tablet.nome);

        System.out.println(tablet.codice);

        tablet.priceChange(260.35);

        System.out.println(tablet.prezzo);

        tablet.ivaChange(22);

        System.out.println(tablet.finalPrice());

        System.out.println(tablet.extendedName());
        
    }
}
