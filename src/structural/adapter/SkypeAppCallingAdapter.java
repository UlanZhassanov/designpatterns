package structural.adapter;

public class SkypeAppCallingAdapter extends SkypeApp implements PhoneCalling {

    @Override
    public void call() {
        videoCall();
    }
}
