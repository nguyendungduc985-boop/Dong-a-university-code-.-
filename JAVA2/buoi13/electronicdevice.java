package buoi13;

public class electronicdevice {
    public static void main(String[] args) {
        switchable light = new light();
        switchable fan = new fan();
        
        light.switchOn();
        light.switchOff();
        
        fan.switchOn();
        fan.switchOff();
    }
    
}
