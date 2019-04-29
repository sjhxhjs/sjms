import main.SingleTon;

public class TestSingleTon {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getSingleton();
        System.out.println(singleTon.toString());
    }
}
