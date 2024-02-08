package prototype;

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
    }
}
