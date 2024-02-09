package creational.builder;

public class Fighter {
    private boolean kick;
    private boolean punch;
    private boolean wrest;

    public Fighter(boolean kick, boolean punch, boolean wrest) {
        this.kick = kick;
        this.punch = punch;
        this.wrest = wrest;
    }

    public boolean isKick() {
        return kick;
    }

    public boolean isPunch() {
        return punch;
    }

    public boolean isWrest() {
        return wrest;
    }
}
