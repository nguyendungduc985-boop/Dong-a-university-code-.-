package buoi9;

public class nhieutry {
    public static void main(String[] args) {
    int[] mangSoNguyen=new int[5];
    try {
        mangSoNguyen[5]=10;
        System.out.println(mangSoNguyen[5]);
        int so=0;
        double thuong=10/so;
        System.out.println(thuong);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Co loi xay ra ve mang: "+e.getMessage());
    }
    catch (ArithmeticException e) {
        System.out.println("Co loi xay ra ve so: "+e.getMessage());
    }
    catch (Exception e){
        System.out.println("Bat tat ca cac loi");
    }
    finally{
        System.out.println("Loi hay khong deu chay lenh nay");
    }
    System.out.println("Dong lenh o cuoi chuong trinh");
}
}
