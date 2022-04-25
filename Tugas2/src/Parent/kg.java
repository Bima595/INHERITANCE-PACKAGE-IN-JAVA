package Parent;

public class kg extends Drive {
    String warna1,warna2,warna3,warna4;

    public kg(String warna1, String warna2, String warna3, String warna4){
        super(warna1,warna2,warna3,warna4);
        this.warna1 = warna1;this.warna2 = warna2;this.warna3 = warna3;this.warna4 = warna4;
        System.out.println("warna yang tersedia : \n-"+ warna1);
        System.out.println("-"+ warna2);
        System.out.println("-"+ warna3);
        System.out.println("-"+ warna4);
    }
}
