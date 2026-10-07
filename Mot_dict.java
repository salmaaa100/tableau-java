package TD1;

public class Mot_dict {
    private String mot;
    private String defi;

    public Mot_dict(String mot, String defi) {
        this.mot = mot;
        this.defi = defi;
    }

    public String getMot() {
        return mot;
    }

    public String getDefinition() {
        return defi;
    }

    public void setDefi(String defi) {
        this.defi = defi;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public boolean synonyme(String mot) {
        return this.mot.equalsIgnoreCase(mot);
    }
}