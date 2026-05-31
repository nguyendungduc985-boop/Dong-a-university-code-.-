package Project;
import java.util.Date;

public class messenger {
    private user sender;
    private user receiver;
    private String content;
    private Date timestamp;

    public messenger(user sender,String content){
        this.sender = sender;
        this.content = content;
        this.timestamp = new Date();
    }
    
   public void sendMessage(user sender ,user receiver, String content){
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = new Date();
   }
   
   public void ShowMessage(){
        String receiverName = (receiver != null) ? receiver.getUsername() : "ChatRoom";
        System.out.println("[" + timestamp + "] " + sender.getUsername() + " -> " + receiverName + ": " + content); 
   }
}