package com.br.wendell.sensores.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        //tamanho maximo da matriz
        Integer matriz = new Integer(48);
        // Criação do objeto SensorData
        SensorData sensorData = new SensorData();

        // Criação de um objeto SimpleDateFormat para formatação da hora
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        // Criação de um objeto Calendar para simulação da coleta de dados a cada 30 minutos durante um dia
        Calendar calendar = Calendar.getInstance();

        // Coleta de dados a cada 30 minutos durante um dia
        for (int i = 0; i < matriz; i++) {
            // Simulação de valores aleatórios para temperatura, umidade e CO2
            int temp = (int) (Math.random() * 30) + 10;
            int umid = (int) (Math.random() * 60) + 20;
            int co2 = (int) (Math.random() * 2000) + 500;
            String hora = sdf.format(calendar.getTime());
            sensorData.registrarDados(temp, umid, co2, hora);
            calendar.add(Calendar.MINUTE, 30);
        }

        // Classificação dos dados e impressão dos resultados
        sensorData.ordenarPorUmidade();
        System.out.println("Dados classificados por umidade:");
        sensorData.imprimirDados();

        sensorData.ordenarPorTemperatura();
        System.out.println("Dados classificados por temperatura:");
        sensorData.imprimirDados();

        sensorData.ordenarPorCO2();
        System.out.println("Dados classificados por CO2:");
        sensorData.imprimirDados();
    }
}
