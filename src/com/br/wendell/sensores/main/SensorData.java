package com.br.wendell.sensores.main;

import com.br.wendell.sensores.classes.CO2;
import com.br.wendell.sensores.classes.Hora;
import com.br.wendell.sensores.classes.Umidade;
import com.br.wendell.sensores.classes.Temperatura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SensorData {

   // Cada sensor terá sua própria estrutura de dados para armazenar os valores e hora da leitura
    private Temperatura temperatura = new Temperatura(); // Fila (Queue) para armazenar a temperatura
    private Umidade umidade = new Umidade(); // Lista (ArrayList) para armazenar a umidade
    private CO2 co2 = new CO2(); // Pilha (Stack) para armazenar o CO2
    private Hora hora = new Hora(); // Lista (ArrayList) para armazenar a hora da leitura

    // Método para registrar os dados enviados pelos sensores
    public void registrarDados(int temp, int umid, int c, String h) {
        temperatura.add(temp);
        umidade.add(umid);
        co2.add(c);
        hora.add(h);
    }

    // Métodos para ordenar os dados de acordo com a especificação
    public void ordenarPorUmidade() {
        Collections.sort(umidade.getUmidade(), Collections.reverseOrder());
    }

    public void ordenarPorTemperatura() {
        ArrayList<Integer> tempList = new ArrayList<>(temperatura.getTemperatura());
        Collections.sort(tempList);
        temperatura.getTemperatura().clear();
        temperatura.getTemperatura().addAll(tempList);
    }

    public void ordenarPorCO2() {
        Stack<Integer> tempStack = new Stack<>();
        while (!co2.getCO2().isEmpty()) {
            int temp = co2.getCO2().pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                co2.getCO2().push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        co2.getCO2().addAll(tempStack);
    }

    // Método para imprimir os dados classificados
    public void imprimirDados() {
        for (int i = 0; i < temperatura.getTemperatura().size(); i++) {
            System.out.println("Hora: " + hora.getHora().get(i) + " Temperatura: " + temperatura.getTemperatura().peek() + " Umidade: " + umidade.getUmidade().get(i) + " CO2: " + co2.getCO2().peek());
            temperatura.getTemperatura().offer(temperatura.getTemperatura().poll());
            co2.getCO2().push(co2.getCO2().pop());
        }
    }
}
