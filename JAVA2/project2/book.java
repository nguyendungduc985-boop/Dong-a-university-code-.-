package project2;
public class book {
    String Ten_sach;
    String Tac_gia;
    String Gia_ban;

    public book(String Ten_sach, String Tac_gia, String Gia_ban){
        this.Ten_sach = Ten_sach;
        this.Tac_gia = Tac_gia;
        this.Gia_ban = Gia_ban;
    }
    public void Showinfo(){
        System.out.println("Ten sach:"+ this.Ten_sach + " Tac gia:" + this.Tac_gia +"Gia ban:" + this.Gia_ban);
    }
    }