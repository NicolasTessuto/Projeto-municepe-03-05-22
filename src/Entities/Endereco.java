package Entities;

public class Endereco {

    private int numero;
    private String endereco;
    private String bairro;

    @Override
    public String toString() {
        return "Endereco{" +
                "numero=" + numero +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
