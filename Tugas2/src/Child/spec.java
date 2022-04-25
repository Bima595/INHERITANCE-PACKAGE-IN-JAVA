package Child;

import Parent.Drive;

public class spec extends Drive {
    public String nama;
    public String spec;
    public int tahun;

    public spec(String nama , String spec, int tahun){
        super(nama,spec,tahun);
        this.nama = nama;this.spec = spec;this.tahun = tahun;
        System.out.println("nama produk : "+ nama);
        System.out.println();
        System.out.println("specification Smartphone \n-"+ spec);
        System.out.println("tahun                    \n-"+ tahun);
    }
}

