package buoi1;

public class Sinhvien {
    public String ten;
    public int tuoi;
    public String diachi;

    public Sinhvien(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public void inthongtin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diachi);
    }
}


