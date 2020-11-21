package mehmetbaykal.odev2;
//is-a ilişkisi
public class Apple extends Factory {

    Keyboard keyboard; //    has - a ilişkisi

    public Apple(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void callVideo() {
        System.out.println("Apple can video call");
    }

    public void shareScreen() {
        System.out.println("Apple can share screen");
    }

    public void showKeyboard() {
        keyboard.show();
    }


    @Override
    public void call() {

        System.out.println("Apple can call");
    }

    @Override
    public void sendSms() {
        System.out.println("Apple can  send sms");
    }

    public void info(){
        System.out.println("\nApple Feature : \nModel Name :\t" + getModelName() +
                "\nImei Number :\t" + getImei() +"\nVersiyon numarası :\t" + getVersion() +
                "\nRam(MB) :\t" + getRam() + "\nInç\t: " + getInc());
    }

}
