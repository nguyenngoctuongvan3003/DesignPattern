package state;

public class TVContent implements State{
    private State tvState;

    public void setState(State state){
        this.tvState=state;
    }

    
    @Override
    public void doAction() {
        this.tvState.doAction();
    }


    public State getTvState() {
        return this.tvState;
    }

}
