package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CadastroMunicipe> listaDeMunicipes = new ArrayList<>();
        PrintMenus printMenus = new PrintMenus();
        int selecUser = 0;
        do{
            printMenus.menuInicial();
            selecUser = sc.nextInt();
            switch(selecUser){
                case 1:
                    aaa;
                    break;
                case 2:
                    bbb;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(selecUser != 3);
    }
}
