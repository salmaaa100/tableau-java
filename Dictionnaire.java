package TD1;

public class Dictionnaire {
    private int nb_mots;
    private Mot_dict[] dict;
    private String nom;

    public Dictionnaire(int taille, String nom) {
        this.nom = nom;
        this.nb_mots = 0;
        this.dict = new Mot_dict[taille];
    }

    public void trier() {
        for (int i = 0; i < nb_mots - 1; i++) {
            for (int j = i + 1; j < nb_mots; j++) {
                if (dict[i].getMot().compareToIgnoreCase(dict[j].getMot()) > 0) {
                    Mot_dict temp = dict[i];
                    dict[i] = dict[j];
                    dict[j] = temp;
                }
            }
        }
    }

    public void ajouter_Mot(Mot_dict mot) {
        if (nb_mots < dict.length) {
            dict[nb_mots] = mot;
            nb_mots++;
            trier();
        }
    }

    public void Supprimer_Mot(Mot_dict mot) {
        for (int i = 0; i < nb_mots; i++) {
            if (dict[i].getMot().equalsIgnoreCase(mot.getMot())) {
                for (int j = i; j < nb_mots - 1; j++) {
                    dict[j] = dict[j + 1];
                }
                dict[nb_mots - 1] = null;
                nb_mots--;
                break;
            }
        }
    }

    public String Recherche_dicho(String mot) {
        int debut = 0, fin = nb_mots - 1;
        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            int comp = dict[milieu].getMot().compareToIgnoreCase(mot);
            if (comp == 0) return dict[milieu].getDefinition();
            if (comp < 0) debut = milieu + 1;
            else fin = milieu - 1;
        }
        return "Mot introuvable.";
    }

    public void Lister_dictionnaire() {
        System.out.println("=== " + nom + " ===");
        for (int i = 0; i < nb_mots; i++) {
            System.out.println(dict[i].getMot() + " : " + dict[i].getDefinition());
        }
    }

    public int Nombre_synonyme(Mot_dict mot) {
        int count = 0;
        for (int i = 0; i < nb_mots; i++) {
            if (dict[i].getDefinition().equalsIgnoreCase(mot.getDefinition()) && !dict[i].getMot().equalsIgnoreCase(mot.getMot())) {
                count++;
            }
        }
        return count;
    }
}
