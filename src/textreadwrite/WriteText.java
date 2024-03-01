package textreadwrite;

import java.io.*;

public class WriteText {

    public static void writeFile(String dir){

        try {
            FileWriter writer = new FileWriter(dir, true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
