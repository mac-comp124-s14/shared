package edu.macalester.comp124.section3.phone;

/**
 * @author Shilad Sen
 */
public class SmartPhone extends Phone {
    private String os;
    private String passcode;

    public SmartPhone(int[] number, String carrier, String os, String passcode) {
        super(number, carrier);
        this.os = os;
        this.passcode = passcode;
    }

    public String getOs() {
        return os;
    }

    public String getPasscode() {
        return passcode;
    }

    @Override
    public void sendText(String message) {

    }
}
