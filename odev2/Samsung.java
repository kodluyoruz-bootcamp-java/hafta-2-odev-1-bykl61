package mehmetbaykal.odev2;
//is-a ilişkisi
public class Samsung extends Factory{
    Keyboard keyboard; // has -a ilişkisi

    public Samsung(Keyboard keyboard) {

        this.keyboard = keyboard;
    }
    public void shareFile() {
        System.out.println("Samsung can share file");
    }

    public void listenMp3() {
        System.out.println("listen mp3 in Samsung");
    }

    public void showKeyboard() {
        keyboard.show();
    }


    @Override
    public void call() {

        System.out.println("Samsung can call");
    }

    @Override
    public void sendSms() {
        System.out.println("Samsung can  send sms");
    }
    public void info(){
        System.out.println("\nSamsung Feature : \nModel Name :\t" + getModelName() +
                "\nImei Number :\t" + getImei() +"\nVersiyon numarası :\t" + getVersion() +
                "\nRam(MB) :\t" + getRam() + "\nInç\t: " + getInc());
    }

}
