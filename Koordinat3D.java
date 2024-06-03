package tpmod6_1302210044;

public class Koordinat3D {
    private int x;
    private int y;
    private int z;

    public Koordinat3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String toString() {
        return "Posisi 3D: (" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}