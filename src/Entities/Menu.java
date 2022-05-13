package Entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public Scanner sc = new Scanner(System.in);
    private int selecUser;

    public  boolean verificaCpf(ArrayList<Municipe> listaDeMunicipes, String cpf) {
        for (int i = 0; i < listaDeMunicipes.size(); i++) {
            if (listaDeMunicipes.get(i).getCpf().equals(cpf)) {
                System.out.print("CPF JÁ CADASTRADO NO SISTEMA, TENTE NOVAMENTE: ");
                return true;
            }
        }
        return false;
    }

    public boolean verificaListaVazia(ArrayList<Municipe> listaDeMunicipes) {
        if (listaDeMunicipes.isEmpty()) {
            System.out.println("A SUA LISTA DE MUNICIPES ESTA VAZIA\n");
            return true;
        } else {
            return false;
        }
    }

    public void opcSelcUser(ArrayList<Municipe> listaDeMunicipes) throws ParseException {
        do {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" +
                    "SELECIONE A OPÇÃO DESEJADA:\n" +
                    "[1] - CADASTRAR UM NOVO MUNICIPE\n" +
                    "[2] - EXIBIR MUNICIPE CADASTRADOS\n" +
                    "[3] - REMOVER UM MUNICIPE PELO CPF\n" +
                    "[4] - SAIR DO SISTEMA\n");
            selecUser = sc.nextInt();
            sc.nextLine();
            switch (selecUser) {
                case 1:
                    Municipe municipe = new Municipe();
                    System.out.print("POR FAVOR INFORME OS SEGUINTES DADOS:\nNome: ");
                    municipe.setNome(sc.nextLine());
                    System.out.print("CPF: ");
                    String auxCpf = sc.nextLine();
                    if (verificaCpf(listaDeMunicipes, auxCpf)) {
                        verificaCpf(listaDeMunicipes, auxCpf);
                        System.out.print("TENTE NOVAMENTE: ");
                        auxCpf = sc.nextLine();
                    } else {
                        municipe.setCpf(auxCpf);
                    }
                    /*
                    Rg rg = new Rg();
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
                    cadastroMunicipe.setReligiao(sc.nextLine());
                    */
                    listaDeMunicipes.add(municipe);
                    System.out.println("CADASTRO FINALIZADO");
                    break;
                case 2:
                    if (verificaListaVazia(listaDeMunicipes)) {
                        System.out.println("A LISTA DE MUNICIPES ESTA VAZIA");
                    } else {
                        for (Municipe m1 : listaDeMunicipes){
                            System.out.println(m1);
                        }
                    }
                    break;
                case 3:
                    System.out.print("INFORME O CPF DO MUNICIPE QUE DESEJA EXCLUIR (APENAS DIGITOS): ");
                    auxCpf = sc.nextLine();
                    for (Municipe m : listaDeMunicipes) {
                        if (m.getCpf().equals(auxCpf)){
                            listaDeMunicipes.remove(m);
                            System.out.println("MUNICIPE REMOVIDO COM SUCESSO!");
                            break;
                        }
                        else {
                            System.out.println("NAO FOI ENCONTRADO NENHUM MUNICIPE COM ESSE CPF...");
                        }
                    }
                    break;
                case 4:
                    System.out.println("-=-=FIM DO SISTEMA=-=");
                    System.exit(0);
                    break;
                default:
                    System.out.print("OPÇÃO INVÁLIDA, TENTE NOVAMENTE: ");
                    opcSelcUser(listaDeMunicipes);
            }
        } while (selecUser != 4);
    }
}