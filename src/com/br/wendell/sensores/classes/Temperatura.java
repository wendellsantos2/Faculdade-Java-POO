/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.wendell.sensores.classes;

/**
 *
 * @author Wendell
 */
import java.util.LinkedList;
import java.util.Queue;

public class Temperatura {
    private Queue<Integer> temperatura = new LinkedList<>();

    public void add(int temp) {
        temperatura.offer(temp);
    }

    public Queue<Integer> getTemperatura() {
        return temperatura;
    }
}
