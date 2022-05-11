package Entities;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Municipe> listaDeMunicipes = new ArrayList<>();
        Menu menu = new Menu();
        System.out.println("-=-=BEM-VINDO AO SISTEMA=-=-");
        menu.opcSelcUser(listaDeMunicipes);
        }
    }
