package TemperaturaNonStatic;

public class Temperatura {
    public int temperaturaActuala;
    public String camera;

    public Temperatura(int temperaturaActuala, String camera) {
        this.temperaturaActuala = temperaturaActuala;
        this.camera = camera;
    }

    Temperatura() {
    }


    public int getTemperaturaActuala() {
        return temperaturaActuala;
    }

    public void setTemperaturaActuala(int temperaturaActuala) {
        this.temperaturaActuala = temperaturaActuala;
    }

    public boolean ePreaCald(int temperaturaMaxima) {
        if (this.temperaturaActuala >= temperaturaMaxima) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperaturaActuala=" + temperaturaActuala +
                '}';
    }
}