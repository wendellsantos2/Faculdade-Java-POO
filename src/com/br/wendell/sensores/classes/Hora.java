package com.br.wendell.sensores.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wendell
 */

import java.util.ArrayList;

public class Hora {
    private ArrayList<String> hora = new ArrayList<>();

    public void add(String h) {
        hora.add(h);
    }

    public ArrayList<String> getHora() {
        return hora;
    }
}
