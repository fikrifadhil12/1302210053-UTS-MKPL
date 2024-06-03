package tpmod6_1302210044;

public class Semut extends Serangga {
    public Semut(String warna, int x, int y) {
        super(warna, new Koordinat(x, y));
    }

    @Override
    public void terbang() {
    }

    public String info() {
        return "Warna: " + this.warna + "\n" + this.posisi.toString();
    }
}