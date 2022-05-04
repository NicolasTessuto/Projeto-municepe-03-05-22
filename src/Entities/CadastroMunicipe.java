package Entities;

import Enums.Cor;
import Enums.EstadoCivil;
import Enums.Pne;

import java.util.Date;

public class CadastroMunicipe {

    private String nome;
    private String cpf;
    private Rg rg;
    private Titulo titulo;
    private Date nascimento;
    private String naturalidade;
    private String nascionalidade;
    private Enum<EstadoCivil> estadoCivilEnum;
    private Endereco endereco;
    private String fone; //utilizando variaveis do tipo string para evitar erros com os caracteres () -
    private String celular; //utilizando variaveis do tipo string para evitar erros com os caracteres () -
    private Date dataChegada;
    private Enum<Cor> cor;
    private String nomeDoPai;
    private String nomeDaMae;
    private String ocupacao;
    private String escolaridade;
    private String formacao;
    private String ondeEstuda;
    private Enum<Pne> pne;
    private String estudoPretendido;
    private String clube;
    private String associacao;
    private String sindicato;
    private String religiao;
    private boolean solicCupomFiscal;
    private boolean pretendeEstudar;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Rg getRg() {
        return rg;
    }

    public void setRg(Rg rg) {
        this.rg = rg;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public Enum<EstadoCivil> getEstadoCivilEnum() {
        return estadoCivilEnum;
    }

    public void setEstadoCivilEnum(Enum<EstadoCivil> estadoCivilEnum) {
        this.estadoCivilEnum = estadoCivilEnum;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Enum<Cor> getCor() {
        return cor;
    }

    public void setCor(Enum<Cor> cor) {
        this.cor = cor;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getOndeEstuda() {
        return ondeEstuda;
    }

    public void setOndeEstuda(String ondeEstuda) {
        this.ondeEstuda = ondeEstuda;
    }

    public Enum<Pne> getPne() {
        return pne;
    }

    public void setPne(Enum<Pne> pne) {
        this.pne = pne;
    }

    public String getEstudoPretendido() {
        return estudoPretendido;
    }

    public void setEstudoPretendido(String estudoPretendido) {
        this.estudoPretendido = estudoPretendido;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getAssociacao() {
        return associacao;
    }

    public void setAssociacao(String associacao) {
        this.associacao = associacao;
    }

    public String getSindicato() {
        return sindicato;
    }

    public void setSindicato(String sindicato) {
        this.sindicato = sindicato;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public boolean isSolicCupomFiscal() {
        return solicCupomFiscal;
    }

    public void setSolicCupomFiscal(boolean solicCupomFiscal) {
        this.solicCupomFiscal = solicCupomFiscal;
    }

    public boolean isPretendeEstudar() {
        return pretendeEstudar;
    }

    public void setPretendeEstudar(boolean pretendeEstudar) {
        this.pretendeEstudar = pretendeEstudar;
    }
}
