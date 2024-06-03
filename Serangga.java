package tpmod6_1302210044;

public abstract class Serangga {
    String warna;
    protected Koordinat posisi;

    public Serangga(String warna, Koordinat posisi) {
        this.warna = warna;
        this.posisi = posisi;
    }

    abstract public void terbang();

    public String info() {
        return "Warna: " + this.warna + "\n" + this.posisi.toString();
    }
}