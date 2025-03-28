package state;

public class TVRemote {
    public static void main(String[] args) {
        TVContent tvContent= new TVContent();
        State tvStartState= new TVStartState();
        State tvStopState= new TVStopState();

        tvContent.setState(tvStartState);
        tvContent.doAction();

        tvContent.setState(tvStopState);
        tvContent.doAction();
    }
}
