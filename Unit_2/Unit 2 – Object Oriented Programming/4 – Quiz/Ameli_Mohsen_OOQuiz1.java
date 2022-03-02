/**
* Name: Mohsen Ameli
* Date: March 1, 2022
* Description: main method calling the Human, Vegetable, and Cookie classes
*/
public class Ameli_Mohsen_OOQuiz1 {
    public static void main(String [] args) {
        // creating a hero i mean a human
        Human human = new Human("Zelenskyy", 44, 70);

        // creating a vegetable object
        Vegetable vegie = new Vegetable("carrot", 100, 200);

        // creaing three cookies
        Cookie cookie1 = new Cookie("oreos", 100, 200, true);
        Cookie cookie2 = new Cookie();
        Cookie cookie3 = new Cookie("tiktak", 50, 1000);

        // eating the first cookie
        human.eat(cookie1, 50);

        System.out.println(); // line break

        // eating the vegetable
        human.eat(vegie, 420);

        System.out.println(); // line break

        // human before eating the cookie
        System.out.println(human.toString());
        human.eat(cookie3, 50); // eating a cookie
        System.out.println(human.toString());
    }
}
