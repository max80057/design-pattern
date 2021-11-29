public class ToolBox {

    Jump jump = new Jump();
    Walk walk = new Walk();
    Run run = new Run();

    public void DoJump(){
        jump.DoThing();
    }

    public void DoWalk(){
        walk.DoThing();
    }

    public void DoRun(){
        run.DoThing();
    }
}
