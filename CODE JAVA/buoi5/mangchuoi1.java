package buoi5;

public class mangchuoi1 {
    public static void main(String[] args) {
        
        String[] names=new Scanner(System.in);
        for(int i =0; i< names.length; i++){
            System.out.printf("nhap tten thu %d: ",i);
            names [i]=sc.nextLines();
        }
        //in các phần tử trong mảng names
        for(int i =0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }
}
