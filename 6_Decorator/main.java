public class main {

    public static void main(String[] args) {
        Componet cc = new ConcreteComponet();
        DecoratorBefore db = new DecoratorBefore(cc);
        DecoratorAfter da = new DecoratorAfter(db);

        db.Special();
        cc.Operation();
        da.Special();

    }
}
