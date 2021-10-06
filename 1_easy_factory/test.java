public class test {

    public static void main(String[] args) {
        Operation work = new EasyFactory().create("add");
        work.setNumberA(63);
        work.setNumberB(7);
        System.out.println(work.getResult());

        work = new EasyFactory().create("sub");
        work.setNumberA(63);
        work.setNumberB(7);
        System.out.println(work.getResult());

        work = new EasyFactory().create("mul");
        work.setNumberA(63);
        work.setNumberB(7);
        System.out.println(work.getResult());

        work = new EasyFactory().create("div");
        work.setNumberA(63);
        work.setNumberB(7);
        System.out.println(work.getResult());

    }
}
