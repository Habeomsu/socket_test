package main.socket_1;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String type;
    private String sender;
    private String receiver;
    private String message;

    public void setSender(String sender) {this.sender = sender;}

    public void newConnect(){
        this.type = "new";
    }

    public void closeConnect(){
        this.type = "close";
    }


}
