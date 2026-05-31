package buoi6;

import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
       thuocnd t1 = new thuocnd(_ma: "T001", _ten_thuoc:"paracetamol", _Gia_cb: 100.0, _giabaoquan: 20.0, _giavanchuyen: 50.0);
       thuocnd t2 = new thuocnd(_ma: "T002", _ten_thuoc:"betadine", _Gia_cb: 150.0, _giabaoquan: 25.0, _giavanchuyen: 55.0);
       thuocnd t3 = new thuocnd(_ma: "T003", _ten_thuoc:"Vitamin", _Gia_cb: 200.0, _giabaoquan: 30.0, _giavanchuyen: 60.0);
    
       ArrayList<thuocnd> lstThuoc = new ArrayList<>(); 
       lstThuoc.add(t1); 
       lstThuoc.add(t2); 
       lstThuoc.add(t3);
       for(thuocnd i : listND) {
           i.hienthi(); 
       }
    }
}

