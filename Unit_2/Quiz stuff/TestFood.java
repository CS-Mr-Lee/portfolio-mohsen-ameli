public class TestFood {
    public static void main(String [] args) {
        Meat meatObj = new Meat("human", "intestine", 69, 2, false);
        meatObj.setFatContent(0);
        System.out.println(meatObj.getFatContent());
    }
}
