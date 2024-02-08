package prototype;

public abstract class Phone {
    public boolean calling;
    public boolean messaging;

    public Phone() {
    }

    public Phone(Phone phone) {
        if (phone != null) {
            this.calling = phone.calling;
            this.messaging = phone.messaging;
        }
    }


    public abstract Phone clone();
}
