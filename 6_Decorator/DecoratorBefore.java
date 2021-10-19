public class DecoratorBefore extends Decorator{

    public DecoratorBefore(Componet cc){
        this.componet = cc;
    }

    @Override
    public void Special() {
        System.out.println("所以我在之前先做點什麼");
    }
}
