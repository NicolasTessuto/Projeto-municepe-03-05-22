package Entities;

import java.util.Date;

public class Rg {

    private int numRg;
    private String emissor;
    private String uf;
    private Date data;

    public int getNumRg() {
        return numRg;
    }

    public void setNumRg(int numRg) {
        this.numRg = numRg;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
