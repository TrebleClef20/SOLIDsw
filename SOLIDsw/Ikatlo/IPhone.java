package Ikatlo;

public class IPhone implements Callable, Textable, Browseable, Pictureable {

    @Override
    public void makeCall(String number) {
        System.out.println("Call Made");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SMS sent");
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Browsing the Web");
    }

    @Override
    public void takePicture() {
        System.out.println("Smile, 1, 2, 3!!, Picture Taken");
    }

}
