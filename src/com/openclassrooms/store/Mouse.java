package com.openclassrooms.store;

public class Mouse extends ComputerArticle {

    public Mouse(Brand brand, double price) { // constructeur qui utlise les attributs de la class mére, ComputerArticle
        super(brand, price);
        // TODO Auto-generated constructor stub
    }

}// j'avais implémenté le constructeur de mouse complet ici, pareil dans la
 // classe Screen. aprés vérif de la soluce j'ai vu qu'il ne fallait pas faire
 // ça. J'ai ensuite essayé de laisser la classe entiérement vide, le logiciel
 // m'a proposé la méthode ci-dessus de lui même
/*
 * @Override
 * public String toString() {
 * return "Mouse{" +
 * super.toString() +
 * '}';
 */
