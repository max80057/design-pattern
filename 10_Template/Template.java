public abstract class Template {

    public abstract void operation1();
    public abstract void operation2();

    public void doThing(){

        //共同的部分
        operation1();
        operation2();

        System.out.println("計算結束");
    }

}
