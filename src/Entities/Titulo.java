package Entities;

public class Titulo {

    private int titulo;
    private String secao;
    private String zona;

    @Override
    public String toString() {
        return "Titulo{" +
                "titulo=" + titulo +
                ", secao='" + secao + '\'' +
                ", zona='" + zona + '\'' +
                '}';
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
