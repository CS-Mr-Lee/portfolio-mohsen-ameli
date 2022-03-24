/**
 * Main class
 */
public class Main {
    public static void main(String [] args) {
        Electronics asus = new Electronics("rog", "black", "asus", "rgb", 8, 4, 50, 16, 14, 14, 2000, 2);
        System.out.println(asus.toString());
        asus.game(2);
        System.out.println(asus.toString());
    }
}