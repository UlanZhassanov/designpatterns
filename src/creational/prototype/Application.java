package creational.prototype;

public class Application {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.sencorTouch = true;
        smartPhone.calling = true;
        smartPhone.messaging = true;
        smartPhone.videoCall = true;

        System.out.println(smartPhone);

        SmartPhone smartPhoneClone = (SmartPhone) smartPhone.clone();
        System.out.println("===========================================");
        System.out.println(smartPhoneClone);
        System.out.println("===========================================");

        PushButtonPhone pushButtonPhone = new PushButtonPhone();
        pushButtonPhone.calling = true;
        pushButtonPhone.messaging = true;
        pushButtonPhone.buttonsCount = 21;
        System.out.println(pushButtonPhone);

    }
}
