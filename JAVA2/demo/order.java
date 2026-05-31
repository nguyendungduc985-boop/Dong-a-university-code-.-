package demo;

public class order {
    customer cus;
    private food[] list_foods; 
    private int count;         

    public order(customer _cus){
        this.cus = _cus;
        this.list_foods = new food[100]; 
        this.count = 0;
    }

    public void add(food f){
        if (count < list_foods.length) {
            this.list_foods[count] = f;
            count++;
        } else {
            System.out.println("Don hang da day, khong the them mon");
        }
    }

    public void addfood(food f){
        this.add(f);
    }

    public double Sum_Price(){
        double sum = 0;
        for (int i = 0; i < count; i++){
            sum += list_foods[i].Real_Price();
        }
        return sum;
    }

    public void Showinfo(){
        System.out.println("THONG TIN DON HANG");
        if (cus != null) {
            cus.Showinfo();
        }
        System.out.println("Danh sach mon:");
        for (int i = 0; i < count; i++){
            list_foods[i].Showinfo();
        }
        System.out.println("--------------------------");
        System.out.println("Tong cong: " + Sum_Price());
    }
}