package TemperaturaStatic;

public class Temperatura {

    private int temperaturaActuala;
    private String camera;
    public static int temperaturaMaxima = 30;

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

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public static int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public static void setTemperaturaMaxima(int temperaturaMaxima) {
        Temperatura.temperaturaMaxima = temperaturaMaxima;
    }

    public boolean ePreaCald(int temperaturaMaxima) {
        if (this.temperaturaActuala >= Temperatura.temperaturaMaxima) {
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
