package Ejercicio3_termostatoInteligente;

public class Termostato {
    private static final double MINIMA = 15.0;
    private static final double MAXIMA = 30.0;

    private double temperaturaActual;
    private String modoOperacion;

    public Termostato(double temperaturaActual, String modoOperacion) {
        if (temperaturaActual < MINIMA || temperaturaActual > MAXIMA) {
            throw new IllegalArgumentException("La temperatura inicial debe estar entre 15 y 30 grados.");
        }
        this.temperaturaActual = temperaturaActual;
        this.modoOperacion = modoOperacion;
    }

    public void setTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura < MINIMA || nuevaTemperatura > MAXIMA) {
            System.out.println("ADVERTENCIA: " + nuevaTemperatura + " °C está fuera del rango permitido (15 a 30 °C). No se modificó.");
            return;
        }
        temperaturaActual = nuevaTemperatura;
        System.out.println("Temperatura configurada en " + temperaturaActual + " °C.");
    }

    public double getTemperatura() {
        return temperaturaActual;
    }

    public String getModoOperacion() {
        return modoOperacion;
    }
}
