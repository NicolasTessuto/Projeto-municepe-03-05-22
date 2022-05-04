package Entities;

import Enums.EstadoCivil;
import Enums.Pne;

import java.util.Date;

public class CadastroMunicipe {

    private String nome;
    private String cpf;
    private Rg rg;
    private Date nascimento;
    private String naturalidade;
    private String nascionalidade;
    private Enum<EstadoCivil> estadoCivilEnum;
    private Endereco endereco;
    private String fone; //utilizando variaveis do tipo string para evitar erros com os caracteres () -
    private String celular; //utilizando variaveis do tipo string para evitar erros com os caracteres () -
    private Date dataChegada;
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





}
