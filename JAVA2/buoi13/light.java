package buoi13;

public class light implements switchable {

    @Override
    public void switchOff() {
    System.out.println("Đèn đã tắt");
        
    }

    @Override
    public void switchOn() {
        System.out.println("Đèn đã bật");
        
    }
    

}
