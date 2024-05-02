package Ikatlo;

public class BasicPhone implements Callable, Textable {

    @Override
    public void makeCall(String number) {
        System.out.println("Call Made");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SMS sent");
    }

}
