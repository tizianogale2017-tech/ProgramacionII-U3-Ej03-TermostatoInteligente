package Ejercicio3_termostatoInteligente;

public class Main {
    public static void main(String[] args) {
        Termostato termostato = new Termostato(22.0, "AUTOMATICO");
        System.out.println("Modo: " + termostato.getModoOperacion() + " - Temperatura: " + termostato.getTemperatura() + " °C");

        termostato.setTemperatura(25.5);
        termostato.setTemperatura(40.0);
        termostato.setTemperatura(10.0);

        System.out.println("Temperatura final: " + termostato.getTemperatura() + " °C");
    }
}
