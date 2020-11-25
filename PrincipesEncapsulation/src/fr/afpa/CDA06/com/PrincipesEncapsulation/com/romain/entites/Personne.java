// Nom du package où est définie la méthode Personne
package fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.entites;

/**
*
*  @author Romain-Coutureau
*/

public class Personne {

    //-----------------------------------------
    // Les caractéristiques physiques
    // -----------------------------------------

    private String name;
    private String company;
    //  Variable de classe matérialisant le non rattachement
    //  à une société selon notreconvention .
    private static final String PAS_DE_SOCIETE = "?";

    //----------------------------------------------------
    // Les caractéristiques comportementales
    // ----------------------------------------------------

    // 1-Construit un objet Personne de société inconnue et de nom correspondant
    // au paramètre nom
    public Personne(String name, String company) {
        this.name = name.toUpperCase();
        this.company = company;
    }

    public Personne(String name) {
        this.name = name;
        company = PAS_DE_SOCIETE;
    }

    // 2 -Affiche les caractéristiques de la personne
    public void print() {
        System.out.print("Je m'appelle " + name);

        if (company.equals("?"))
            System.out.print(" et je ne suis pas salarié d'une entreprise \n");
        else
            System.out.println(" et je travaille chez : " + company);
    }

    public void exitCompany() {
        // La personne n’est pas rattachée à une société
        if (company.equals("?")) {
            print();
            System.out.println("Impossible de quitter la société");
            System.exit(1); // Arrêt de l'exécution, code erreur 1
        }
        // Ici, il y a bien une société à quitter, on applique la convention
        company = PAS_DE_SOCIETE;
    }

    private String okOrNotOkCompany(String namecompany) {
        if (namecompany.length() > 30 || namecompany.equals(PAS_DE_SOCIETE)) {
            System.out.println("Classe Personne, société incorrecte : "
                    + namecompany);
            System.exit(2);
        }
        return namecompany;
    }

    public void setCompany(String entreprise) {
        if (!company.equals(PAS_DE_SOCIETE)) {
            print();
            System.out.println("Erreur : 1 exitCompany, puis 2 setCompany");
            System.exit(1);
        }
        company = okOrNotOkCompany(entreprise).toUpperCase();
    }
}
