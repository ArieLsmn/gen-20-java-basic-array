package textreadwrite;

import java.io.*;

public class ReadText {

    public static void readFile(String dir) throws IOException {
        File file = new File(
                dir);

        BufferedReader br
                = new BufferedReader(new FileReader(file));


        String st;

        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }

}
