public class DecoratorAfter extends Decorator{

    public DecoratorAfter (Componet cc) {
        this.componet = cc;
    }

    @Override
    public void Special() {
        System.out.println("然後我在之後做了點什麼");
    }
}
