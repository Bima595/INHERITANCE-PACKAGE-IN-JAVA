package Parent;
import Child.spec;
import Child.Harga;
public class Drive {
    public Drive(String nama, String spec, String warna3, String warna4) {
    }

    public Drive(String nama, String spec, int harga) {
    }
    public static void main(String[] args) {
        spec s1 = new spec("Iphone XR","A12 BIONIC",2022);
        Harga h1 = new Harga("Iphone XR","A12 BIONIC",7000000);
        kg k1 = new kg ("merah","hitam","biru","putih");

    }
}
