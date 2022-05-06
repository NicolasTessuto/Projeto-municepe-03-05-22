package Entities;

import Enums.Cor;
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
                    System.out.print("\nNº RG: ");
                    rg.setNumRg(sc.nextInt());
                    System.out.print("\nEmissor: ");
                    rg.setEmissor(sc.nextLine());
                    System.out.print("\nData de emissão: (dd/MM/yyyy): ");
                    String auxData = sc.nextLine();
                    rg.setData(new SimpleDateFormat("dd/MM/yyy").parse(auxData));
                    cadastroMunicipe.setRg(rg);
                    Titulo titulo = new Titulo();
                    System.out.print("\nNumero do titulo: ");
                    titulo.setTitulo(sc.nextInt());
                    System.out.print("\nSeção: ");
                    titulo.setSecao(sc.nextLine());
                    System.out.print("\nZona: ");
                    titulo.setZona(sc.nextLine());
                    cadastroMunicipe.setTitulo(titulo);
                    System.out.print("\nData de nascimento: ");
                    auxData = sc.nextLine();
                    cadastroMunicipe.setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(auxData));
                    System.out.print("\nNaturalidade: ");
                    cadastroMunicipe.setNaturalidade(sc.nextLine());
                    System.out.print("\nNascionalidade: ");
                    cadastroMunicipe.setNascionalidade(sc.nextLine());
                    System.out.print("\nSEXO: ");
                    cadastroMunicipe.setSexo(sc.nextLine());
                    System.out.print("\nESTADO CIVIL:  (SOLTEIRO = 1, CASADO = 2, " +
                            "SEPARADO = 3, CONCUBINATO = 4, VIUVO = 5, DIVORCIADO = 6)\n");
                    int enumEstadoCivil = sc.nextInt();
                    System.out.print("\nDependentes ? (True/false): ");
                    cadastroMunicipe.setDependentes(sc.nextBoolean());
                    Endereco endereco = new Endereco();
                    System.out.print("\nEndereco: ");
                    endereco.setEndereco(sc.nextLine());
                    System.out.print("\nBairro: ");
                    endereco.setBairro(sc.nextLine());
                    System.out.print("\nNumero: ");
                    endereco.setNumero(sc.nextInt());
                    cadastroMunicipe.setEndereco(endereco);
                    System.out.print("\nTelefone: ");
                    cadastroMunicipe.setFone(sc.nextLine());
                    System.out.print("\nCelular: ");
                    cadastroMunicipe.setCelular(sc.nextLine());
                    System.out.print("\nData atual: ");
                    auxData = sc.nextLine();
                    cadastroMunicipe.setDataChegada(new SimpleDateFormat("dd/MM/yyyy").parse(auxData));
                    System.out.print("\nCor da pele:  (Branco = 1, negra = 2, amrela = 3, Pardo = 4\n");
                    int cor = sc.nextInt();
                    if(cor == 1){
                        cadastroMunicipe.setCor(Cor.Branco);
                    }
                    else if(cor == 2){
                        cadastroMunicipe.setCor(Cor.Pardo);
                    }
                    else if(cor == 3){
                        cadastroMunicipe.setCor(Cor.amrela);
                    }
                    else if(cor == 4){
                        cadastroMunicipe.setCor(Cor.negra);
                    }
                    else
                        cadastroMunicipe.setCor(Cor.Pardo);
                    System.out.print("\nNome do pai: ");
                    cadastroMunicipe.setNomeDoPai(sc.nextLine());
                    System.out.print("\nNome da mae: ");
                    cadastroMunicipe.setNomeDaMae(sc.nextLine());
                    System.out.print("\nOcupacao: ");
                    cadastroMunicipe.setOcupacao(sc.nextLine());
                    System.out.print("\nEscolaridade: ");
                    cadastroMunicipe.setEscolaridade(sc.nextLine());
                    System.out.print("\nOnde estuda: ");
                    cadastroMunicipe.setOndeEstuda(sc.nextLine());
                    System.out.print("\nPretende voltar a estudar (True/False): ");
                    cadastroMunicipe.setPretendeEstudar(sc.nextBoolean());
                    System.out.print("\nPne (Portador de necessidades expeciais): ");
                    int enumPne = sc.nextInt();
                    System.out.print("\nEstudo pretendido: ");
                    cadastroMunicipe.setEstudoPretendido(sc.nextLine());
                    System.out.print("\nAssociação: ");
                    cadastroMunicipe.setAssociacao(sc.nextLine());
                    System.out.print("\nClube: ");
                    cadastroMunicipe.setClube(sc.nextLine());
                    System.out.print("\nSindicato: ");
                    cadastroMunicipe.setSindicato(sc.nextLine());
                    System.out.print("\nReligião: ");
                    cadastroMunicipe.setReligiao(sc.nextLine());
                    listaDeMunicipes.add(cadastroMunicipe);
                    break;
                case 2:
                    for (CadastroMunicipe cadastroMunicipe1 : listaDeMunicipes){
                        System.out.println(cadastroMunicipe);
                    }
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
