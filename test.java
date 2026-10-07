package TD1;

public class test {
	  public static void main(String[] args) {
	        Dictionnaire d = new Dictionnaire(5, "Larousse");

	        Mot_dict m1 = new Mot_dict("Zone", "Espace");
	        Mot_dict m2 = new Mot_dict("Arbre", "Plante");
	        Mot_dict m3 = new Mot_dict("Maison", "Logement");

	        d.ajouter_Mot(m1);
	        d.ajouter_Mot(m2);
	        d.ajouter_Mot(m3);

	        d.Lister_dictionnaire();
	        System.out.println("Recherche 'Arbre' : " + d.Recherche_dicho("Arbre"));

	        d.Supprimer_Mot(m2);
	        System.out.println("\nApres suppression :");
	        d.Lister_dictionnaire();
	    }
}
