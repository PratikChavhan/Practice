import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\coder\\OneDrive\\Desktop\\newFile.txt");
            StringBuilder data = new StringBuilder();
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                // System.out.println(sc.nextLine());
                data.append(sc.nextLine());
            }
            sc.close();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
