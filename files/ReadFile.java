import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadFile rf = new ReadFile();

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();
        System.out.println();

        System.out.print("Enter filetype (e.g., txt, html): ");
        String filetype = sc.nextLine();
        System.out.println();

        rf.readFile(filename, filetype);
        sc.close();
    }

    public void readFile(String filename, String filetype) {
        String fileName = filename + "." + filetype;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Failed to read file");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
