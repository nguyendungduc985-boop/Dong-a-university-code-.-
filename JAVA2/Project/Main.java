package Project;

public class Main {
    public static void main(String[] args) {
        user u1 = new user("Dung");
        user u2 = new user("Hung");
        user u3 = new user("Nam");

        System.out.println("=== TIN NHAN CA NHAN ===");
        messenger directMsg = new messenger(u1, ""); 
        directMsg.sendMessage(u1, u2, "Chao anh Hung, hom nay tiem sua xe dong khach khong?");
        directMsg.ShowMessage();
        System.out.println();

        System.out.println("=== TAO PHONG CHAT ===");
        chatroom room = new chatroom("R01", "Team DH Dong A");
        room.JoinChatRoom(u1, "Team DH Dong A");
        room.JoinChatRoom(u2, "Team DH Dong A");
        room.JoinChatRoom(u3, "Team DH Dong A");

        room.SendMessage(u1, "Team DH Dong A", "Moi nguoi code xong bai OOP nay chua?");
        room.SendMessage(u3, "Team DH Dong A", "Dang fix loi ne, kho ghe.");
        room.SendMessage(u2, "Team DH Dong A", "Anh khong ranh code lam, di sua xe day =))");

        room.ShowMessage();
    }
}