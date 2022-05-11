package Entities;

import Enums.Cor;
import Enums.EstadoCivil;
import Enums.Pne;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Municipe {

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
    private String sexo;
    private boolean solicCupomFiscal;
    private boolean pretendeEstudar;
    private boolean dependentes;

    public static Scanner sc = new Scanner(System.in);
    public Menu menu = new Menu();

    @Override
    public String toString() {
        return "CadastroMunicipe{" +
                "nome='" + nome + "\n" +
                ", cpf='" + cpf + "\n" +
                ", rg=" + rg + "\n" +
                ", titulo=" + titulo + "\n" +
                ", nascimento=" + nascimento + "\n" +
                ", naturalidade='" + naturalidade + "\n" +
                ", nacionalidade='" + nascionalidade + "\n" +
                ", estadoCivilEnum=" + estadoCivilEnum + "\n" +
                ", endereco=" + endereco + "\n" +
                ", fone='" + fone + "\n" +
                ", celular='" + celular + "\n" +
                ", dataChegada=" + dataChegada + "\n" +
                ", cor=" + cor + "\n" +
                ", nomeDoPai='" + nomeDoPai + "\n" +
                ", nomeDaMae='" + nomeDaMae + "\n" +
                ", ocupacao='" + ocupacao + "\n" +
                ", escolaridade='" + escolaridade + "\n" +
                ", formacao='" + formacao + "\n" +
                ", ondeEstuda='" + ondeEstuda + "\n" +
                ", pne=" + pne + "\n" +
                ", estudoPretendido='" + estudoPretendido + "\n" +
                ", clube='" + clube + "\n" +
                ", associacao='" + associacao + "\n" +
                ", sindicato='" + sindicato + "\n" +
                ", religiao='" + religiao + "\n" +
                ", sexo='" + sexo + "\n" +
                ", solicCupomFiscal=" + solicCupomFiscal + "\n" +
                ", pretendeEstudar=" + pretendeEstudar + "\n" +
                ", dependentes=" + dependentes + "\n" +
                '}';
    }

    public Municipe() { // Fiz um construtor vazio para que serja possivel instanciar o obj antes de ter todos os atributos
    }

    public Municipe(String nome, String cpf, Rg rg, Titulo titulo, Date nascimento, String naturalidade, String nascionalidade, Enum<EstadoCivil> estadoCivilEnum, Endereco endereco, String fone, String celular, Date
            dataChegada, Enum<Cor> cor, String nomeDoPai, String nomeDaMae, String ocupacao, String escolaridade, String formacao, String ondeEstuda, Enum<Pne> pne, String estudoPretendido, String clube, String associacao, String sindicato, String religiao, String sexo, boolean solicCupomFiscal, boolean pretendeEstudar, boolean dependentes) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.titulo = titulo;
        this.nascimento = nascimento;
        this.naturalidade = naturalidade;
        this.nascionalidade = nascionalidade;
        this.estadoCivilEnum = estadoCivilEnum;
        this.endereco = endereco;
        this.fone = fone;
        this.celular = celular;
        this.dataChegada = dataChegada;
        this.cor = cor;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.ocupacao = ocupacao;
        this.escolaridade = escolaridade;
        this.formacao = formacao;
        this.ondeEstuda = ondeEstuda;
        this.pne = pne;
        this.estudoPretendido = estudoPretendido;
        this.clube = clube;
        this.associacao = associacao;
        this.sindicato = sindicato;
        this.religiao = religiao;
        this.sexo = sexo;
        this.solicCupomFiscal = solicCupomFiscal;
        this.pretendeEstudar = pretendeEstudar;
        this.dependentes = dependentes;
    }

    public boolean isDependentes() {
        return dependentes;
    }

    public void setDependentes(boolean dependentes) {
        this.dependentes = dependentes;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

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
