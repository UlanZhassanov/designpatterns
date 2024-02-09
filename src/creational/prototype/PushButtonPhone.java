package creational.prototype;

public class PushButtonPhone extends Phone{
    int buttonsCount;

    public PushButtonPhone() {
    }

    public PushButtonPhone(PushButtonPhone pushButtonPhone) {
        super();
        this.buttonsCount = pushButtonPhone.buttonsCount;
    }

    @Override
    public Phone clone() {
        return new PushButtonPhone(this);
    }

    @Override
    public String toString() {
        return "PushButtonPhone{" +
                "buttonsCount=" + buttonsCount +
                ", calling=" + calling +
                ", messaging=" + messaging +
                '}';
    }
}
