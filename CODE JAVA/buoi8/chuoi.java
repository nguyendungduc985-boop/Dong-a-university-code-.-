package buoi8;

import buoi7.chuvivadientichhinhtron;

public class chuoi {
    public static void main(String[] args) {
        char kytu='a';
        char[] mangkytu={'a','b','c','d','e'};
        String chuoi1=new String();
        String chuoi2="Van Loi";
        String chuoi3=new String(mangkytu,1, 2);
        System.out.println(kytu);
        System.out.println(chuoi1);
        System.out.println(chuoi2);
        System.out.println(chuoi2.charAt(2));
        System.out.println(chuoi2.length());
        System.out.println(chuoi3);
    }

}
