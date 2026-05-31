package buoi5;

public class Bird extends animal {
    @Override 
    public void move() {
        System.out.println("Bird is flying" );
    }
    @Override
    public void sleep(){
        System.out.println("Bird is sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Bird is eating");
    }
}
