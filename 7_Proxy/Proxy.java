public class Proxy implements Subject {

    Subject subject;

    public Proxy(Subject sj) {
        this.subject = sj;
    }

    @Override
    public void service() {

        System.out.println("在前面做點什麼");

        subject.service();

        System.out.println("後面在做點什麼");

    }
}