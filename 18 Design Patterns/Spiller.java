public class Spiller {
    private int vinn = 0;
    private int tap = 0;
    private String navn = "";

    public int getVinn() {
        return vinn;
    }

    public void vinn() {this.vinn++;}

    public void setVinn(int vinn) {
        this.vinn = vinn;
    }

    public int getTap() {
        return tap;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn + " " + Integer.toString(vinn) + " - " + Integer.toString(tap);
    }
}