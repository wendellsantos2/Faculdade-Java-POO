package com.br.wendell.sensores.classes;

import java.util.ArrayList;

public class Umidade {
    private ArrayList<Integer> umidade = new ArrayList<>();

    public void add(int umid) {
        umidade.add(umid);
    }

    public ArrayList<Integer> getUmidade() {
        return umidade;
    }
}

