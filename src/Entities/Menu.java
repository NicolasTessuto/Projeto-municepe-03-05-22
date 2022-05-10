package Entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    private int selecUser;

    public void opcSelcUser(ArrayList<CadastroMunicipe> listaDeMunicipes, CadastroMunicipe cadastroMunicipe) throws ParseException {
        do {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"+
                "SELECIONE A OPÇÃO DESEJADA:\n" +
                "[1] - CADASTRAR UM NOVO MUNICIPE\n" +
                "[2] - EXIBIR MUNICIPE CADASTRADOS\n" +
                "[3] - REMOVER UM MUNICIPE PELO CPF\n" +
                "[4] - SAIR DO SISTEMA\n");
        selecUser = sc.nextInt();
        sc.nextLine();
        switch (selecUser) {
            case 1:
                CadastroMunicipe.Cadastrar(listaDeMunicipes, cadastroMunicipe);
                break;
            case 2:
                CadastroMunicipe.Imprimir(listaDeMunicipes, cadastroMunicipe);
                break;
            case 3:
                CadastroMunicipe.removeMunicipe(listaDeMunicipes, cadastroMunicipe);
                break;
            case 4:
                System.out.println("-=-=FIM DO SISTEMA=-= ");
                System.exit(0);
                break;
            default:
                System.out.print("OPÇÃO INVÁLIDA, TENTE NOVAMENTE: ");
                opcSelcUser(listaDeMunicipes, cadastroMunicipe);
        }
        }while  (selecUser != 4);
    }
}