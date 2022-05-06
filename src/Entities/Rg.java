package Entities;

import java.util.Date;

public class Rg {

    private String numRg;
    private String emissor;
    private String uf;
    private Date data;


    @Override
    public String toString() {
        return "Rg[" +
                "nºRg=" + numRg +
                "|Emissor='" + emissor + '\'' +
                "|UF='" + uf + '\'' +
                "|Data Emi=" + data +
                ']';
    }

    public String getNumRg() {
        return numRg;
    }

    public void setNumRg(String numRg) {
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
