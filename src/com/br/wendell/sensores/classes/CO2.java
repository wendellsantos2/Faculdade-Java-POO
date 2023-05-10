package com.br.wendell.sensores.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Stack;

public class CO2 {
    private Stack<Integer> co2 = new Stack<>();

    public void add(int c) {
        co2.push(c);
    }

    public Stack<Integer> getCO2() {
        return co2;
    }
}
