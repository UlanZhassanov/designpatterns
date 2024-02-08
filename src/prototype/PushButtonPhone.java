package prototype;

public class PushButtonPhone extends Phone{
    int buttonsCount;

    public PushButtonPhone(PushButtonPhone pushButtonPhone) {
        super();
        this.buttonsCount = pushButtonPhone.buttonsCount;
    }

    @Override
    public Phone clone() {
        return new PushButtonPhone(this);
    }
}
