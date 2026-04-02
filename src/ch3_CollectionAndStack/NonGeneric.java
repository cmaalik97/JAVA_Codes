package ch3_CollectionAndStack;
public class NonGeneric {
    public static void main(String[] args) {
        IntegerMsgSender intMsg=new IntegerMsgSender(20);
        intMsg.send();
        DoubleMsgSender dblMsg=new DoubleMsgSender(20.5);
        dblMsg.send();
        StringMsgSender strMsg=new StringMsgSender("Hello");
        strMsg.send();
        //the assingment in class
        System.out.println(" ");

        IntegerMsgSender intMsg2=new IntegerMsgSender(25);
        intMsg2.send();
        DoubleMsgSender dblMsg2=new DoubleMsgSender(25.5);
        dblMsg2.send();
        StringMsgSender strMsg2=new StringMsgSender("Welcome");
        strMsg2.send();



    }
}
class IntegerMsgSender{
    int message;
    IntegerMsgSender(int message) {
        this.message = message;
    }
    public void send(){
        System.out.println("The sent message is "+message);
    }
}
class DoubleMsgSender{
    double message;
    DoubleMsgSender(double message) {
        this.message = message;
    }
    public void send(){
        System.out.println("The sent message is "+message);
    }
}
class StringMsgSender{
    String message;
    StringMsgSender(String message) {
        this.message = message;
    }
    public void send(){
        System.out.println("The sent message is "+message);
    }
}


