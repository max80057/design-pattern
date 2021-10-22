public class main {

    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.service();

    }
}
