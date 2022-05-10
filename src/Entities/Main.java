package Entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        CadastroMunicipe cadastroMunicipe = new CadastroMunicipe();
        ArrayList<CadastroMunicipe> listaDeMunicipes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("-=-=BEM-VINDO AO SISTEMA=-=-");
        menu.menuInicial();
        menu.opcSelcUser(listaDeMunicipes, cadastroMunicipe);
        }
    }
