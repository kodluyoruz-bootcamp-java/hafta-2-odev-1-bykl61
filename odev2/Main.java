package mehmetbaykal.odev2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TouchKeyboard touchKeyboard = new TouchKeyboard();
        PhysicalKeyboard physicalKeyboard = new PhysicalKeyboard();

        // interface ile polymorphsim
        Apple apple = new Apple(touchKeyboard);
        apple.showKeyboard();
        apple.sendSms();// overriding  ile polymorphism aynı metot ile fark çıktı alabiliyoruz
        apple.call();// overriding ile polymorphism
        apple.callVideo();
        apple.shareScreen();

        apple.setModelName("Iphone 12");
        apple.setImei("123AS14587QD");
        apple.setVersion("1.0");
        apple.setRam(4096);
        apple.setInc((float)6.1);
        apple.info();


        System.out.println("-------------------");
        // interface ile polymorphsim
        Samsung samsung = new Samsung(physicalKeyboard);
        samsung.showKeyboard();
        samsung.call(); // overriding ile polymorphism aynı metot ile fark çıktı alabiliyoruz
        samsung.sendSms();// overriding ile polymorphism
        samsung.shareFile();
        samsung.listenMp3();

        samsung.setModelName("Galaxy S20");
        samsung.setImei("AC1254789654");
        samsung.setVersion("2.0");
        samsung.setRam(8192);
        samsung.setInc((float)6.2);
        samsung.info();


    }
}
