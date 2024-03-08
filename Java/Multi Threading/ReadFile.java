import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // Specify the path to the image file
        File file = new File("C:\\Users\\coder\\OneDrive\\Desktop\\newFile.txt");

        try {
            // Create a FileInputStream to read from the file
            FileInputStream inputStream = new FileInputStream(file);

            // // Create a byte array to store the file content
            // byte[] bytes = new byte[(int) file.length()];
            // // Read the content of the file into the byte array
            // int numOfBytes = inputStream.read(bytes);

            // Create a StringBuilder to efficiently construct the String
            // StringBuilder contentBuilder = new StringBuilder();
            // Create a StringBuilder to efficiently construct the String
            StringBuffer contentBuffer = new StringBuffer();

            // Read the content of the file character by character
            int character;
            while ((character = inputStream.read()) != -1) {
                // contentBuilder.append((char) character);
                contentBuffer.append((char) character);
            }

            // Close the FileInputStream
            inputStream.close();

            // Store the content in a String variable
            // String fileContent = contentBuilder.toString();
            String fileContent = contentBuffer.toString();

            // Print the number of bytes read and a success message
            // System.out.println("Data copied successfully...");
            // System.out.println("Number of bytes read: " + numOfBytes);

            // Print the content of the text file
            System.out.println("Content of the text file:\n" + fileContent);
        } catch (IOException e) {
            // Handle IO exception if it occurs
            e.printStackTrace();
        }
    }
}
