package buoi3;

public class invatinhtongn {
    public static void main(String[] args) {
        int n = 10;
        // in dãy số từ 1 đến 10
        for(int i=1;i<=n;i++)
        System.out.println(i);
        long tong=0;
        //tong=tong+1
        //tong=tong+2
        //tong=tong+3
        //...........
        //tong=tong+n
        for(int i=1;i<=n;i++) {
            tong=tong+i;
        }
        System.out.println("Tong N= "+tong);
    }
}

