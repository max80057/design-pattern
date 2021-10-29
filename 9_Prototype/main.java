public class main {

    public static void main(String[] args) {

        Pdata pdata = new Pdata();
        pdata.setpName("第二案");
        pdata.setpDay("30天");
        pdata.setMember("小明");

        Pdata copypdata = (Pdata) pdata.clone();
        copypdata.setMember("大明");

        Pdata copypdata2 = (Pdata) pdata.clone();
        copypdata2.setpDay("40天");


        pdata.show();
        copypdata.show();
        copypdata2.show();


    }
}
