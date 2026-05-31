package Project;
import java.util.ArrayList;
import java.util.List;

public class chatroom {
    private String id;
    private String name;
    private List<user> users;
    private List<messenger> messages; 

    public chatroom(String _id,String _name){
        this.id = _id;
        this.name = _name;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();        
    }
    
    public void JoinChatRoom(user _user, String _roomName) {
        if(this.name.equals(_roomName)){
            users.add(_user);
            System.out.println("He thong: " + _user.getUsername() + " da tham gia phong " + _roomName);
        }
    } 

    public void SendMessage(user _user, String _roomName, String _content) {
        if (this.name.equals(_roomName) && users.contains(_user)) {
            messenger msg = new messenger(_user, _content); 
            messages.add(msg);
        } else {
            System.out.println(">> Loi: " + _user.getUsername() + " chua tham gia phong nay!");
        }
    }

    public void ShowMessage() {
        System.out.println("\n--- DOAN CHAT TRONG PHONG: " + name + " (ID: " + id + ") ---");
        for (messenger msg : messages) { 
            msg.ShowMessage(); 
        }
        System.out.println("-----------------------------------"); 
    }
}