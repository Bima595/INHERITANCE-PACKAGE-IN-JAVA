package Child;

import Parent.Drive;

public class Harga extends Drive {
    public String nama;
    public String spec;
    public int harga;

    public Harga(String nama, String spec,int harga){
        super(nama,spec,harga);
        this.harga = harga;

---------------------------EWRUIOP        System.out.println("harga produk di tahun tersebut : "+ harga);
    }
}
