import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main (String[] args) {

        Pattern pattern1 = Pattern.compile("<i|I m|M g|G\\s+(.*)src\\s*=\\s*(.*)");

        File file = new File("src/input.txt");

        int k = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                k += 1;
                Matcher matcher1 = pattern1.matcher(line);
                if (matcher1.find()){
                    System.out.println(Integer.toString(k) + ". " +line);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
