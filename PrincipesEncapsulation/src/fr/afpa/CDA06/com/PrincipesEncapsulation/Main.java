// Nom du package où est définie la méthode main
package fr.afpa.CDA06.com.PrincipesEncapsulation;

// Importation de la classe Personne avec son package d’appartenance
import fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.entites.Personne;

/**
*
*  @author Romain-Coutureau
*/

public class Main {

/**
* @param args the command line arguments
*/

    public static void main(String[] args) {
    System.out.println("Passage dans main");
	Personne personne;
//	Personne martin = new Personne("martin", "Java SARL");
//	Personne dupont = new Personne("dupont");
	Personne durand = new Personne("durand", "J2E SA");
//	martin.print();
//	dupont.print();
	durand.print();
	durand.exitCompany();
	durand.print();
	durand.setCompany("EJB Corporate");
	durand.print();
    }
}
