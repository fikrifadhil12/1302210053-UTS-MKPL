package tpmod6_1302210044;

public class DriverSerangga {
    public static void main(String[] args) {
        Semut S = new Semut("hitam", 60, 80);
        System.out.println(S.info());

        Lebah L = new Lebah("kuning", 20, 30);
        System.out.println(L.info());

        L.terbang();

        System.out.println(L.info());

        S.terbang();

        System.out.println(S.info());
    }
}