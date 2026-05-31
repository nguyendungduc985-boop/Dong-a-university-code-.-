package buoi13;

public class fan implements switchable,Ajustable {
    private int speedlevel = 0;

    @Override
    public void switchOff() {
        System.out.println("Quạt đã tắt");
        
    }

    @Override
    public void switchOn() {
        System.out.println("Quạt đã bật");
        
    }

    @Override
    public void increaseSpeed() {
        if(speedlevel < 5){
            speedlevel++;
            System.out.println("Tăng tốc độ quạt lên cấp " + speedlevel);

        }   
    }
    @Override
    public void decreaseSpeed() {
        if(speedlevel > 0){
            speedlevel--;
            System.out.println("Giảm tốc độ quạt xuống cấp " + speedlevel);

        }   
    }
    
}