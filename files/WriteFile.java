import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    private File file;
    private BufferedWriter bw;

    public WriteFile() {
        file = new File("");
    }

    public static void main(String[] args) {
        WriteFile wf = new WriteFile();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename (e.g, myfile): ");
        String filename = scanner.nextLine();
        System.out.println();

        System.out.print("Enter file extension: (e.g, txt, html): ");
        String fileType = scanner.nextLine();
        System.out.println();

        System.out.print("Enter the text you want to write into " + filename + " : ");
        String text = scanner.nextLine();

        wf.writeFile(filename, fileType, text);
        scanner.close();
    }

    public void createNewFile(String filename) {
        try {
            file = new File(filename);
            if (file.exists()) {
                System.out.println("File already exists");
                return;
            }

            if (this.file.createNewFile()) {
                System.out.println(file.getName() + " " + "has been created.");
            } else {
                System.out.println("Failed to create file");
            }
        } catch (IOException e) {
            System.out.println("Failed to create file");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }

    public void writeFile(String filename, String fileType, String text) {
        String fileName = filename + "." + fileType;

        if (!file.exists()) {
            this.createNewFile(fileName);
        }

        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            System.out.println("Failed to write file");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}