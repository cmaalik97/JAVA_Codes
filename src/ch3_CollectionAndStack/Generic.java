package ch3_CollectionAndStack;
public class Generic {
    public static void main(String[] args) {
        MsgSender<Integer> intMsg=new MsgSender<>(20);
        intMsg.send();
        MsgSender<Double> dblMsg=new MsgSender<>(20.5);


        dblMsg.send();
        MsgSender<String> strMsg=new MsgSender<>("Hello");
        strMsg.send();


        //The Assignment in class
        System.out.println(" ");
        System.out.println("OUTPUT 2");
        MsgSender<Integer> intMsg1=new MsgSender<>(25);
        intMsg1.send();
        MsgSender<Double> dblMsg1=new MsgSender<>(25.5);
        dblMsg1.send();
        MsgSender<String> strMsg1=new MsgSender<>("Welcome");
        strMsg1.send();

        System.out.println(" ");
        System.out.println("OUTPUT 3");

        MsgSender<Character> charMsg2=new MsgSender<>('A');
        charMsg2.send();
        MsgSender<String> strMsg2=new MsgSender<>("JAVA");
        strMsg2.send();
        MsgSender<Integer> intMsg2=new MsgSender<>(2026);
        intMsg2.send();
    }

}
class MsgSender<T>{
    T message;
    public MsgSender(T message) {
        this.message = message;
    }
    public void send(){
        System.out.println("The sennt message is "+message);
    }
}