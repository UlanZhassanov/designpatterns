package prototype;

public class SmartPhone extends Phone {
    public boolean sencorTouch;
    public boolean videoCall;

    public SmartPhone() {
    }

    public SmartPhone(SmartPhone smartPhone) {
        super(smartPhone);
        if (smartPhone != null) {
            this.sencorTouch = smartPhone.sencorTouch;
            this.videoCall = smartPhone.videoCall;
        }
    }

    @Override
    public Phone clone() {
        return new SmartPhone(this);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "calling=" + calling +
                ", messaging=" + messaging +
                ", sencorTouch=" + sencorTouch +
                ", videoCall=" + videoCall +
                '}';
    }
}
