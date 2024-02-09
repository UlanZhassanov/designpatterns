package creational.builder;

public class FighterBuilder implements Builder{
    private boolean kick;
    private boolean punch;
    private boolean wrest;

    @Override
    public void setKick(boolean kick) {
        this.kick = kick;
    }

    @Override
    public void setPunch(boolean punch) {
        this.punch = punch;
    }

    @Override
    public void setWrest(boolean wrest) {
        this.wrest = wrest;
    }

    public Fighter getFighter(){
        return new Fighter(kick, punch, wrest);
    }
}
