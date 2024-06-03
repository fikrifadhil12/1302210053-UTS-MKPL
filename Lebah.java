package tpmod6_1302210044;

public class Lebah extends Serangga {
    public Lebah(String warna, int x, int y) {
        super(warna, new Koordinat(x, y));
    }

    @Override
    public void terbang() {
        // Add flying logic later
    }

    @Override
    public String info() {
        return "Warna: " + this.warna + "\n" + this.posisi.toString();
    }
}