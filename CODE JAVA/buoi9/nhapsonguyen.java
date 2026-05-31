package buoi9;

public class nhapsonguyen {
   public static void main(String[] args) {
    int n=nhapSoNguyen();
    System.out.println("Số bạn vừa nhập vào là: "+n);
}
//viết phương thức nhập vào một số nguyên
public static int nhapSoNguyen(){
    Scanner sc=new Scanner(System.in);
    int so=0;
    boolean coLoi=false;
    do {
        System.out.print("Mời bạn nhập vào số nguyên: ");
        try {
            so=Integer.parseInt(sc.nextLine()); //dòng này có khả năng phát sinh lỗi
            coLoi=false;
    }   catch (Exception e) {
            System.out.println("Lỗi xảy ra: "+e.getMessage());
            System.out.println("Số bạn nhập bị sai, làm ơn nhập lại");
            coLoi=true;
    }
    } while (coLoi);
    System.out.println("Dòng lệnh sau khi nhập số xong.");
    sc.close();
    return so;
}
}