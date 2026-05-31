package buoi9;

public class loiphepchia {
    public static void main(String[] args) {
        int a = 7,b = 0;
        int[]mangsonguyen={2,5,7,8};
        try{
        System.out.println(mangsonguyen[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("loi xay ra:"+e.getMessage());
        }
        try {
         System.out.println(a/b);  
         
        } 
        //điều kiện mà khi gặp lỗi 
        catch(ArithmeticException ex){
            //điều kiện khi gặp lỗi đặt ở khối try
            System.out.println("loi !!!!!,phep chia mau so phai khac 0"+ex.getMessage());
        }
        System.out.println("cau lenh sau phep chia da duoc thuc hien");

    }
}
