package Ex4Intrerupator;

/*2. Sa se creeze :
        * interfata IntrerupatorOnOff cu urmatoarele metode abstracte:
        • void turnOff() throws AlreadyOffException;
        • void turnOn() throws AlreadyOnException;
        Sa se creeze de asemenea si exceptiile necesare.*/

public interface IntrerupatorOnOff {

    void turnOff() throws AlreadyOffException;

    void turnOn() throws AlreadyOnException;
}
