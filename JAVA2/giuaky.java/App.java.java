import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<BSToanTG> dsToanTG = new ArrayList<>();
        dsToanTG.add(new BSToanTG("TTG01", "Nguyen Van A", 10000000, 30000000, 15000000));
        dsToanTG.add(new BSToanTG("TTG02", "Tran Thi B", 12000000, 20000000, 10000000));

        double tongLuongToanTG = 0;
        for (BSToanTG bs : dsToanTG) {
            tongLuongToanTG += bs.luongHangThang();
        }
        System.out.println("Tong luong chi cho BS Toan TG: " + tongLuongToanTG);

        ArrayList<BSBanTG> dsBanTG = new ArrayList<>();
        dsBanTG.add(new BSBanTG("BTG01", "Le Van C", 5000000, 2000000, 25)); 
        dsBanTG.add(new BSBanTG("BTG02", "Pham Thi D", 5000000, 1500000, 20));

        double tongLuongBanTG = 0;
        for (BSBanTG bs : dsBanTG) {
            tongLuongBanTG += bs.luongHangThang();
        }
        System.out.println("Tong luong chi cho BS Ban TG: " + tongLuongBanTG);

        System.out.println("\n--- Danh sach bac si co luong > 50 trieu ---");
      
        for (BSToanTG bs : dsToanTG) {
            if (bs.luongHangThang() > 50000000) {
                System.out.println(bs.hoTen + " - Luong: " + bs.luongHangThang());
            }
        }
        
        for (BSBanTG bs : dsBanTG) {
            if (bs.luongHangThang() > 50000000) {
                System.out.println(bs.hoTen + " - Luong: " + bs.luongHangThang());
            }
        }
    }
}