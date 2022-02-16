
import java.io.*;
public class Ameli_ChampionFilter {
    public static void main(String[] args) {
        Double hp = 0.0;
        String name = "";
        String data = "";
        String nameLegend = "";

        try {
            FileReader file = new FileReader("./champions.json");
            BufferedReader myReader = new BufferedReader(file);
            
            // getting the character with the highest hp
            Double biggest = 0.0;
            while ((data = myReader.readLine()) != null) {
                String[] stringSplit = data.split("\"");
                if (stringSplit.length == 2) {
                    if (stringSplit[2].equals("hp")) {
                        System.out.println(stringSplit[2]);
                    }
                    // for (int i = 0; i < stringSplit.length; i++) {
                    //     System.out.println(stringSplit[i]);
                    //     // if (stringSplit[i].contains("hp")) {
                    //     //     System.out.println(stringSplit[i]);
                    //     // }
                    // }
                }
                // System.out.println(stringSplit.length);

                // if(stringSplit[2].equalsIgnoreCase("name")) { // if there is a name, put it in the name so we can show it later
                //     nameLegend = stringSplit[3]; 
                // }

                System.out.println(nameLegend);

                // if (data.contains("\"hp\"")) {
                //     data = data.replace("\"hp\":", " ");
                //     data = data.replace(",", " ");
                //     hp = Double.parseDouble(data);
                //     if (hp > biggest) {
                //         biggest = hp;
                //     }
                // }
            }
            
            // System.out.println(myReader);
            // while ((data = myReader.readLine()) != null) {
            //     System.out.println("asfdd" + data);
            //     if (data.contains(String.valueOf(biggest))) {
            //         name = data.replace("\"name\": \"", " ");
            //         name = data.replace("\",", " ");
            //     }
            // }

            System.out.println(biggest + name);
            myReader.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
