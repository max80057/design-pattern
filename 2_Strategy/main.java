public class main {

    public static void main(String[] args) {
        Context context = new Context();

        System.out.println("印出兩數相加");
        System.out.println(context.UseAdd(63,7));
        System.out.println("印出兩數相減");
        System.out.println(context.UseSub(63,7));
        System.out.println("印出兩數相乘");
        System.out.println(context.UseMul(63,7));
        System.out.println("印出兩數相除");
        System.out.println(context.UseDiv(63,7));

    }
}
