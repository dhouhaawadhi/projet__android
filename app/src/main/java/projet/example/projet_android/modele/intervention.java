package projet.example.projet_android.modele;

public class intervention {
    private String  nom,societ,add,temp;

    public intervention(String nom, String  societ, String add, String temp) {
        this.nom=nom;
        this.societ=societ;
        this.add=add;
        this.temp=temp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSociet() {
        return societ;
    }

    public void setSociet(String societ) {
        this.societ = societ;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
