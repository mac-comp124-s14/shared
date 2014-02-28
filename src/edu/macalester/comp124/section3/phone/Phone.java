package edu.macalester.comp124.section3.phone;

/**
 * @author Shilad Sen
 */
public class Phone {
    private int[] number;
    private String carrier;

    public Phone(int[] number, String carrier) {
        this.number = number;
        this.carrier = carrier;
    }

    public Phone(int[] number) {
        this(number, "AT&T");
    }

    public int[] getNumber() {
        return number;
    }

    public String getCarrier() {
        return carrier;
    }

    public void sendText(String message) {
        //
    }
}
