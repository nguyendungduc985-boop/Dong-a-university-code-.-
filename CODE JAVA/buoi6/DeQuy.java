package buoi6;

public class DeQuy {
public static void main(String[] args) {
    //printF();
    System.out.println(giaiThuaDQ(3));
    System.out.println(giaiThuaLap(0));
}
//Tính n! theo pp lặp
public static long giaiThuaLap(int n){
    long kq=1;
    for(int i=1;i<=n;i++){
        kq=kq*i;
    }
    return kq;
}
//Tính n! đệ quy
public static long giaiThuaDQ(int n){
    //điều kiện dừng
    if(n==0) return 1;
    //công thức quy nạp
    return n*giaiThuaDQ(n-1);
}
//phương thức, hàm đệ quy: gọi đến chính nó

//phương thức này chưa tốt vì đệ quy không dừng
public static void printF(){
    System.out.println("F");
    printF();
   
}

}

    
