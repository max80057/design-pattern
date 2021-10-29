public class Pdata implements Cloneable{

    String pName ="";
    String pDay = "";
    String member = "";

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDay() {
        return pDay;
    }

    public void setpDay(String pDay) {
        this.pDay = pDay;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public void show(){
        System.out.println("Project名稱:" + pName);
        System.out.println("Project時間需要:" + pDay);
        System.out.println("Project成員:" + member);
    }

    public Object clone(){
        Pdata pdata = null;
        try {
            pdata = (Pdata) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pdata;
    }

}
