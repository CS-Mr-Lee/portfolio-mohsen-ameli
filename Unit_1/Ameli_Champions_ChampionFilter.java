/**
* Name: Mohsen Ameli
* Date: Feb 16, 2022
* Description: This program reads info from the champions.json
* file and prints out the name of the character with the highest
* hp and lowest armor.
*/

import java.io.*;
public class Ameli_Champions_ChampionFilter  {
    public static void main(String[] args) {
        String js_data = "";

        // hp vars
        double hp = 0.0;
        double highest_hp = 0.0;
        String temp_name_hp = "";
        String final_name_hp = "";

        // armor vars
        double armor = 0.0;
        double lowest_hp = Double.POSITIVE_INFINITY; // used for comparing armors
        String temp_name_armor = "";
        String final_name_armor = "";

        try {
            // vars to write results to a txt file
            File file_to = new File("MaxChampStats.txt");
            FileWriter fileWriter = new FileWriter(file_to);
            BufferedWriter output = new BufferedWriter(fileWriter);

            // reading from champions.json
            FileReader file = new FileReader("./champions.json");
            BufferedReader myReader = new BufferedReader(file);
            
            // getting the character with the highest hp
            while ((js_data = myReader.readLine()) != null) {
                // seperating the important data from the rest
                String[] keys = js_data.split("\"");

                // if the line is an actual key (if it has two or more quotation marks)
                if (keys.length > 2) {

                    // getting the name of the champion
                    if (keys[1].equals("name")) {
                        temp_name_hp = keys[3];
                        temp_name_armor = keys[3];
                    }

                    // storing the champion with the highest hp
                    if (keys[1].equals("hp")) {
                        String[] temp = js_data.split(":");
                        String[] temp2 = temp[1].split(",");
                        hp = Double.parseDouble(temp2[0]); // converting the string type of hp to double

                        // checking if the hp of the new champion is bigger than the one before
                        if (hp > highest_hp) {
                            highest_hp = hp;
                            final_name_hp = temp_name_hp;
                        }
                    }

                    // storing the champion with the lowest_hp armor
                    if (keys[1].equals("armor")) {
                        String[] temp3 = keys[2].split(" ");
                        String[] temp4 = temp3[1].split(",");
                        armor = Double.parseDouble(temp4[0]); // converting the string type of armor to double
                        if (armor < lowest_hp) {
                            lowest_hp = armor;
                            final_name_armor = temp_name_armor;
                        }
                    }
                
                }
            }

            // writing to a file
            output.write(final_name_hp + " " + highest_hp);
            output.newLine();
            output.write(final_name_armor + " " + lowest_hp);

            // closing everything
            output.close();
            fileWriter.close();
            myReader.close();
        }
        catch(IOException ex) { // catching any errors
            ex.printStackTrace();
            System.out.println("What have you done ?");
        }
    }
}
