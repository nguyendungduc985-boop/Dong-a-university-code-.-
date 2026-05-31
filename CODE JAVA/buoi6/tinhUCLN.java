package buoi6;

public class tinhUCLN {
    public static void main(String[] args) {
        System.out.println(UCLN(18, 12));
        System.out.println(UCLN1(18, 12));
    }
     //tính ước chưng lớn nhất của 2 số c,y
      //đệ quy
    public static int UCLN(int x, int y) {
        if (y == 0)
            return x;
        return UCLN(y, x % y);
    }
  //phương pháp lặp
public static int UCLN1(int x,int y) {
    while (y!=0) {
        //int temp=x
        //x=y;
        //y=temp%y;
        int temp=x%y;
        x=y;
        y=temp;
    }
    //y==0;
    return x;
}
}
  

