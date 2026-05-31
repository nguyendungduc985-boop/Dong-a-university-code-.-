import {UserModel} from "./model/user.model";
class SinhVien extends UserModel{
    public MaSV: String;
    public DiemTB: number;
    constructor(id:String , name:String,tuoi: number,quyen_han: String,MaSV: String,DiemTB: number){
        super(id,name,tuoi,quyen_han);
        this.MaSV = MaSV;
        this.DiemTB = DiemTB;
        
    }
}