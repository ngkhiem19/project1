public class FK {
    public final void guitar(){
        System.out.println("guitar có thể có nhiều dây không giới hạn 6 dây");
    }
}
class piano extends FK {
    public static void main(String[] args) {
        piano p = new piano();
        p.guitar();
    }


}