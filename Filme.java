public class Filme {
    String nume;
    int an;
    float buget;

    public Filme(String nume, int an, float buget) {
        this.nume = nume;
        this.an = an;
        this.buget = buget;
    }

    int vechime(){
        int vechime=2020-an;
        return vechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public float getBuget() {
        return buget;
    }

    public void setBuget(float buget) {
        this.buget = buget;
    }
}
