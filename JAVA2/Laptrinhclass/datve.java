package Laptrinhclass;

public class datve {
    customer cus;
    private datve[] list_Datve;
    private int count;

    public datve(customer _cus){
        this.cus = _cus;
        this.list_Datve = new datve[100];
        this.count = 0;
    }
    public void add(datve d){
        if (count < list_Datve.length) {
            this.list_Datve[count] = d;
            count++;
        } else {
            System.out.println("Don hang da day, khong the them mon");
        }
    }
public void adddatve(datve d){
    this.add(d);
}
public double Sum_Price(){
    double sum = 0;
    for (int i = 0; i < count; i++){
        sum += list_Datve[i].Sum_Price();
    }
    return sum;
}
public void Showinfo(){
    System.out.println("thong tin don hang");
    if (cus != null){
        cus.Showinfo();
    }
    System.out.println("danh sach ve:");
    for (int i = 0; i < count; i++){
        list_Datve[i].Showinfo();
    }
    System.out.println("--------------------------");
    System.out.println("tong cong: " + Sum_Price());
}
}