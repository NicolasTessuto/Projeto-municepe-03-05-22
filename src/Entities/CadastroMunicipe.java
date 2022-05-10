package Entities;

import Enums.Cor;
import Enums.EstadoCivil;
import Enums.Pne;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


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
    private String sexo;
    private boolean solicCupomFiscal;
    private boolean pretendeEstudar;
    private boolean dependentes;

    static Scanner sc = new Scanner(System.in);

    public static void Imprimir(ArrayList<CadastroMunicipe> listaDeMunicipes, CadastroMunicipe cadastroMunicipe) throws ParseException {
        Menu menu = new Menu();
        if(verificaListaVazia(listaDeMunicipes)){
            menu.menuInicial();
            menu.opcSelcUser(listaDeMunicipes, cadastroMunicipe);
        }
        else{
            for (CadastroMunicipe cadastroMunicipe1 : listaDeMunicipes){
                System.out.println(cadastroMunicipe1);
                menu.menuInicial();
                menu.opcSelcUser(listaDeMunicipes, cadastroMunicipe);
            }

        }
    }

    public static void Cadastrar(ArrayList<CadastroMunicipe> listaDeMunicipes, CadastroMunicipe cadastroMunicipe) throws ParseException {
        Menu menu = new Menu();
        System.out.print("POR FAVOR INFOME OS SEGUINTES DADOS:\nNome: ");
        cadastroMunicipe.setNome(sc.nextLine());
        System.out.print("CPF: ");
        String auxCpf = sc.nextLine();
        if (CadastroMunicipe.verificaCpf(listaDeMunicipes, auxCpf)) {
            verificaCpf(listaDeMunicipes, auxCpf);
            System.out.print("TENTE NOVAMENTE: ");
            auxCpf = sc.nextLine();
        } else {
            cadastroMunicipe.setCpf(auxCpf);
        }
        /*Rg rg = new Rg();
        System.out.print("Nº RG: ");
        rg.setNumRg(sc.nextLine());
        System.out.print("Emissor: ");
        rg.setEmissor(sc.nextLine());
        System.out.print("Data de emissão: (dd/MM/yyyy): ");
        String auxData = sc.nextLine();
        rg.setData(new SimpleDateFormat("dd/MM/yyy").parse(auxData));
        System.out.print("UF: ");
        rg.setUf(sc.nextLine());
        cadastroMunicipe.setRg(rg);
        Titulo titulo = new Titulo();
        System.out.print("Numero do titulo: ");
        titulo.setTitulo(sc.nextInt());
        sc.nextLine();
        System.out.print("Seção: ");
        titulo.setSecao(sc.nextLine());
        System.out.print("Zona: ");
        titulo.setZona(sc.nextLine());
        cadastroMunicipe.setTitulo(titulo);
        System.out.print("Data de nascimento: ");
        auxData = sc.nextLine();
        cadastroMunicipe.setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(auxData));
        System.out.print("Naturalidade: ");
        cadastroMunicipe.setNaturalidade(sc.nextLine());
        System.out.print("Nascionalidade: ");
        cadastroMunicipe.setNascionalidade(sc.nextLine());
        System.out.print("SEXO: ");
        cadastroMunicipe.setSexo(sc.nextLine());
        System.out.print("ESTADO CIVIL:  (SOLTEIRO = 1, CASADO = 2, " +
                "SEPARADO = 3, CONCUBINATO = 4, VIUVO = 5, DIVORCIADO = 6)\n");
        int estadoCivil = sc.nextInt();
        if (estadoCivil == 1) {
            cadastroMunicipe.setEstadoCivilEnum(EstadoCivil.SOLTEIRO);
        } else if (estadoCivil == 2) {
            cadastroMunicipe.setEstadoCivilEnum(EstadoCivil.CASADO);
        } else if (estadoCivil == 3) {
            cadastroMunicipe.setEstadoCivilEnum(EstadoCivil.SEPARADO);
        } else if (estadoCivil == 4) {
            cadastroMunicipe.setEstadoCivilEnum(EstadoCivil.CONCUBINATO);
        } else if (estadoCivil == 5) {
            cadastroMunicipe.setEstadoCivilEnum(EstadoCivil.VIUVO);
        } else if (estadoCivil == 6) {
            cadastroMunicipe.setEstadoCivilEnum(EstadoCivil.DIVORCIADO);
        } else {
            cadastroMunicipe.setEstadoCivilEnum(EstadoCivil.SOLTEIRO);
        }
        System.out.print("Dependentes ? (True/false): ");
        cadastroMunicipe.setDependentes(sc.nextBoolean());
        sc.nextLine();
        Endereco endereco = new Endereco();
        System.out.print("Endereco: ");
        endereco.setEndereco(sc.nextLine());
        System.out.print("Bairro: ");
        endereco.setBairro(sc.nextLine());
        System.out.print("Numero: ");
        endereco.setNumero(sc.nextInt());
        sc.nextLine();
        cadastroMunicipe.setEndereco(endereco);
        System.out.print("Telefone: ");
        cadastroMunicipe.setFone(sc.nextLine());
        System.out.print("Celular: ");
        cadastroMunicipe.setCelular(sc.nextLine());
        System.out.print("Data atual (dd/MM/yyyy): ");
        auxData = sc.nextLine();
        cadastroMunicipe.setDataChegada(new SimpleDateFormat("dd/MM/yyyy").parse(auxData));
        System.out.print("Cor da pele:  (Branco = 1, negra = 2, amrela = 3, Pardo = 4\n");
        int cor = sc.nextInt();
        if (cor == 1) {
            cadastroMunicipe.setCor(Cor.Branco);
        } else if (cor == 2) {
            cadastroMunicipe.setCor(Cor.Pardo);
        } else if (cor == 3) {
            cadastroMunicipe.setCor(Cor.amrela);
        } else if (cor == 4) {
            cadastroMunicipe.setCor(Cor.negra);
        } else
            cadastroMunicipe.setCor(Cor.Pardo);
        sc.nextLine();
        System.out.print("Nome do pai: ");
        cadastroMunicipe.setNomeDoPai(sc.nextLine());
        System.out.print("Nome da mae: ");
        cadastroMunicipe.setNomeDaMae(sc.nextLine());
        System.out.print("Ocupacao: ");
        cadastroMunicipe.setOcupacao(sc.nextLine());
        System.out.print("Escolaridade: ");
        cadastroMunicipe.setEscolaridade(sc.nextLine());
        System.out.print("Onde estuda: ");
        cadastroMunicipe.setOndeEstuda(sc.nextLine());
        System.out.print("Pretende voltar a estudar (True/False): ");
        cadastroMunicipe.setPretendeEstudar(sc.nextBoolean());
        sc.nextLine();
        System.out.print("Pne (Portador de necessidades expeciais\n 1 - FISICA 2 - MENTAL 3 -AUDITIVA,  4 - VISUAL, 5 - NENHUMA: ");
        int enumPne = sc.nextInt();
        if (enumPne == 1) {
            cadastroMunicipe.setPne(Pne.FISICA);
        } else if (enumPne == 2) {
            cadastroMunicipe.setPne(Pne.MENTAL);
        } else if (enumPne == 3) {
            cadastroMunicipe.setPne(Pne.AUDITIVA);
        } else if (enumPne == 4) {
            cadastroMunicipe.setPne(Pne.VISUAL);
        } else {
            cadastroMunicipe.setPne(Pne.NENHUMA);
        }
        System.out.print("Estudo pretendido: ");
        sc.nextLine();
        cadastroMunicipe.setEstudoPretendido(sc.nextLine());
        System.out.print("Associação: ");
        cadastroMunicipe.setAssociacao(sc.nextLine());
        System.out.print("Clube: ");
        cadastroMunicipe.setClube(sc.nextLine());
        System.out.print("Sindicato: ");
        cadastroMunicipe.setSindicato(sc.nextLine());
        System.out.print("Religião: ");
        cadastroMunicipe.setReligiao(sc.nextLine());*/
        listaDeMunicipes.add(cadastroMunicipe);
        System.out.println("Cadastro finalizado, o  que deseja fazer agora? ");
        menu.menuInicial();
        menu.opcSelcUser(listaDeMunicipes, cadastroMunicipe);

    }

    public static boolean verificaCpf(ArrayList<CadastroMunicipe> listaDeMunicipes, String cpf) {
        for (int i = 0; i < listaDeMunicipes.size(); i++) {
            if (listaDeMunicipes.get(i).getCpf().equals(cpf)) {
                System.out.print("CPF JÁ CADASTRADO NO SISTEMA, TENTE NOVAMENTE: ");
                return true;
            }
        }
        return false;
    }

    public static boolean verificaListaVazia(ArrayList<CadastroMunicipe> listaDeMunicipes) {
        if (listaDeMunicipes.isEmpty()) {
            System.out.println("A SUA LISTA DE MUNICIPES ESTA VAZIA\n");
            return true;
        } else {
            return false;
        }
    }

    public static void removeMunicipe(ArrayList<CadastroMunicipe> listaDeMunicipes, CadastroMunicipe cadastroMunicipe) throws ParseException {
        System.out.print("INFORME O CPF DO MUNICIPE QUE DESEJA EXCLUIR (APENAS DIGITOS): ");
        Menu menu = new Menu();
        String auxCpf = sc.nextLine();
        for (int i = 0; i < listaDeMunicipes.size(); i++) {
            System.out.println("auxcpf: ");
            if (listaDeMunicipes.get(i).getCpf().equals(auxCpf)) {
                listaDeMunicipes.remove(i);
                System.out.println("MUNICIPE REMOVIDO COM SUCESSO!");
                menu.menuInicial();
                menu.opcSelcUser(listaDeMunicipes, cadastroMunicipe);
            } else {
                System.out.println("NAO FOI ENCONTRADO NENHUM MUNICIPE COM ESSE CPF...");
                removeMunicipe(listaDeMunicipes, cadastroMunicipe);
            }
        }
    }

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

    public CadastroMunicipe() { // Fiz um construtor vazio para que serja possivel instanciar o obj antes de ter todos os atributos
    }

    public CadastroMunicipe(String nome, String cpf, Rg rg, Titulo titulo, Date nascimento, String naturalidade, String nascionalidade, Enum<EstadoCivil> estadoCivilEnum, Endereco endereco, String fone, String celular, Date
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
