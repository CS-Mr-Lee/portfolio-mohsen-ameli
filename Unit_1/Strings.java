/**
* Name: Mohsen Ameli
* Date: Feb 3, 2022
* Description: Demonstrating Strings
*/

public class Strings
{
    public static void main(String[] args)
    {
        // Setting some String variables
        String name = "John";
        String last_name = "Khan";
        String full_name = "John Khan";

        System.out.printf("name : %s, last : %s, full : %s \n", name, last_name, full_name);

        // length() method
        System.out.println(name + " has " + name.length() + " characters.");

        // contains() method
        System.out.printf("Does %s contain %s ? %s \n", full_name, last_name, full_name.contains(last_name));

        // replace() method
        System.out.println("replace John with Mike : " + full_name.replace("John" , "Mike"));

        // charAt() method
        System.out.println("the character in the third index is : " + full_name.charAt(2));

        // indexOf() method
        System.out.println("Khan is positioned at the index number : " + full_name.indexOf("Khan"));

        // compareTo() method
        System.out.println("is name + <space> + last_name equal to full_name ? (0 = yes) : " + full_name.compareTo(name + " " + last_name));
    }
}