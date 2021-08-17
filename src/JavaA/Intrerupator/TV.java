package Ex4Intrerupator;

public class TV extends Electronic {
    public boolean off;

    public TV() {
        super();
    }

    public boolean isOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    @Override
    public void turnOff() throws AlreadyOffException {
        super.turnOff();
    }

    @Override
    public void turnOn() throws AlreadyOnException {
        super.turnOn();
    }

    @Override
    public String toString() {
        return super.toString() + "TV";
    }

}