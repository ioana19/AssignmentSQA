public class Profesor {
    String materie;
    String nume;
    int experienta_ani;

    public Profesor(String materie, String nume, int experienta_ani) {
        this.materie = materie;
        this.nume = nume;
        this.experienta_ani = experienta_ani;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getExperienta_ani() {
        return experienta_ani;
    }

    public void setExperienta_ani(int experienta_ani) {
        this.experienta_ani = experienta_ani;
    }
}
