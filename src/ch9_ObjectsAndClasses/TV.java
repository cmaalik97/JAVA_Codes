package ch9_ObjectsAndClasses;

public class TV {
    int channel=1;//Defualt channel is 1
    int volumeLevel=1;// Defualt volume is 1
    boolean on=false; //By defualt tv is off
    TV(){}
    public void turnOn(){on=true;}
    public void turnOff(){on=false;}
    public void setChannel(int newChannel){
        if (on && newChannel >=1 && newChannel <=120)
            channel=newChannel;

    }
    public void setVolumeLevel(int newVolume){
        if(on && newVolume >=1 && newVolume <=7)
            volumeLevel=newVolume;

    }
    public void channelUp(){
        if (on && channel <120)
            channel++;
    }
    public void channeDown(){
        if (on && channel >1)
            channel--;
    }
    public void volumeUp(){
        if (on && volumeLevel <7)
            volumeLevel++;
    }
    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }



}
