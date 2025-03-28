package state;

public class TVRemoteBasic {
    private String state="";

    public void setState(String state){
       this.state=state;
    }

    private void doAction(){
        if(state.equalsIgnoreCase("ON")){
            System.out.println("TV is turned ON");
        }else if(state.equalsIgnoreCase("OFF")){
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic remoteBasic=new TVRemoteBasic();

        remoteBasic.setState("ON");
        remoteBasic.doAction();

        remoteBasic.setState("OFF");
        remoteBasic.doAction();
    }
}
