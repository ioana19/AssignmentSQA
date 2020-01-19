package com.tema;

public class Masina {
    String firma;
    int an;
    String culoare;

    public Masina(String firma, int an, String culoare) {
        this.firma = firma;
        this.an = an;
        this.culoare = culoare;
    }
    public String getFirma() {
        return firma;
    }
    public void setFirma(String firma) {
        this.firma = firma;
    }
    public int getAn() {
        return an;
    }
    public void setAn(int an) {
        this.an = an;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
