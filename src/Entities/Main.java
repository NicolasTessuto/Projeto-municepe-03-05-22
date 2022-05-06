package Entities;

import Enums.EstadoCivil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<CadastroMunicipe> listaDeMunicipes = new ArrayList<>();
        CadastroMunicipe cadastroMunicipe = new CadastroMunicipe();
        PrintMenus printMenus = new PrintMenus();
        int selecUser = 0;
        System.out.println("-=-=BEM-VINDO AO SISTEMA=-=-");
        printMenus.menuInicial();
        do{
            selecUser = sc.nextInt();
            switch(selecUser){
                case 1:
                    System.out.print("Por favor informe os seguintes dados:\nNome: ");
                    cadastroMunicipe.setNome(sc.nextLine());
                    System.out.print("CPF: ");
                    cadastroMunicipe.setCpf(sc.nextLine());
                    Rg rg = new Rg();
                    System.out.print("Nº RG: ");
                    rg.setNumRg(sc.nextInt());
                    System.out.print("Emissor: ");
                    rg.setEmissor(sc.nextLine());
                    System.out.print("Data de emissão: (dd/MM/yyyy): ");
                    String auxData = sc.nextLine();
                    rg.setData(new SimpleDateFormat("dd/MM/yyy").parse(auxData));
                    Titulo titulo = new Titulo();
                    System.out.print("Numero do titulo: ");
                    titulo.setTitulo(sc.nextInt());
                    System.out.print("Seção: ");
                    titulo.setSecao(sc.nextLine());
                    System.out.print("Zona: ");
                    titulo.setZona(sc.nextLine());
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
                    int enumEstadoCivil = sc.nextInt();
                    System.out.print("Dependentes ? (True/false): ");
                    cadastroMunicipe.setDependentes(sc.nextBoolean());
                    Endereco endereco = new Endereco();
                    System.out.print("Endereco: ");
                    endereco.setEndereco(sc.nextLine());
                    System.out.print("Bairro: ");
                    endereco.setBairro(sc.nextLine());
                    System.out.print("Numero: ");
                    endereco.setNumero(sc.nextInt());
                    System.out.print("Telefone: ");
                    cadastroMunicipe.setFone(sc.nextLine());
                    System.out.print("Celular: ");
                    cadastroMunicipe.setCelular(sc.nextLine());
                    System.out.print("Data atual: ");
                    auxData = sc.nextLine();
                    cadastroMunicipe.setDataChegada(new SimpleDateFormat("dd/MM/yyyy").parse(auxData));
                    System.out.print("Cor da pele:  (Branco = 1, negra = 2, amrela = 3, Pardo = 4\n");
                    int enumCor = sc.nextInt();
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
                    System.out.print("Pne (Portador de necessidades expeciais): ");
                    int enumPne = sc.nextInt();
                    System.out.print("Estudo pretendido: ");
                    cadastroMunicipe.setEstudoPretendido(sc.nextLine());
                    System.out.print("Associação: ");
                    cadastroMunicipe.setAssociacao(sc.nextLine());
                    System.out.print("Clube: ");
                    cadastroMunicipe.setClube(sc.nextLine());
                    System.out.print("Sindicato: ");
                    cadastroMunicipe.setSindicato(sc.nextLine());
                    System.out.print("Religião: ");
                    cadastroMunicipe.setReligiao(sc.nextLine());
                    break;
                case 2:
                    System.out.println("entrou 2 ");
                    break;
                case 3:
                    System.out.println("entrou 3 ");
                    break;
                default:
                    System.out.println("Opção inválida");
                    printMenus.menuInicial();
            }
        }while(selecUser != 3);
    }
}
