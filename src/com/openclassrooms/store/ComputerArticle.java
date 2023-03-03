package com.openclassrooms.store;

public class ComputerArticle {

    public Brand brand;
    public double price;

    // je test de mettre le get et le set ici, je ne sais pas si c'est pertinent.

    public Brand getBrand() {
        return this.brand;
    }

    public void setBrand(Brand newBrand) { // Vu que brand est un "enum" le set Brand n'est peut-être pas approprié.
        this.brand = newBrand;
    }

    // on fait la meme pour la variable price
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public ComputerArticle(Brand brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        return " brand , price";
    }
    // apres verif de la solution je suis pas loin du perfect! Je ne corrige pas
    // pour l'instant par Fair-play et pour voir si ça peut marcher plus tard.
    // Il manque abstract à la class ComputerArticle et un commentaire /** qui est
    // peut-être la javadoc. et un Override
}
