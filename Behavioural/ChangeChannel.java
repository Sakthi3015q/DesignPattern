public class ChangeChannel implements Command{
    TV tv;
    public ChangeChannel(TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
            tv.changeChannel();
    }
}
