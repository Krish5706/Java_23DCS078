// import java.io.*;
// import java.util.Scanner;

// public class P27 {

//     // Method to count the number of lines in a file
//     public static int countLinesInFile(String fileName) throws IOException {
//         int lineCount = 0;

//         // Open the file using a Scanner
//         File file = new File("file1.txt");
//         Scanner scanner = new Scanner("file1");

//         // Count the lines in the file
//         while (scanner.hasNextLine()) {
//             scanner.nextLine();
//             lineCount++;
//         }

//         // Close the scanner
//         scanner.close();

//         return lineCount;
//     }

//     public static void main(String[] args) {
//         // Check if files are provided in the command line arguments
//         if (args.length == 0) {
//             System.out.println("No files specified. Please provide file names as arguments.");
//             return;
//         }

//         // Process each file provided in the command line arguments
//         for (String file : args) {
//             try {
//                 // Count lines in the file
//                 int lineCount = countLinesInFile("file1.txt");
//                 System.out.println(file + ": " + lineCount + " lines");

//             } catch (IOException e) {
//                 // Print error message if there is an issue reading the file
//                 System.out.println("Error reading file: " + file + " (" + e.getMessage() + ")");
//             }
//         }
//     }
// }


// ---------------------

// import java.io.*;
// import java.util.Scanner;

// public class P27 {

//     // Method to count the number of lines in a file
//     public static int countLinesInFile(String fileName) throws IOException {
//         int lineCount = 0;

//         // Open the file using a Scanner
//         File file = new File(fileName);
//         Scanner scanner = new Scanner(file);

//         // Count the lines in the file
//         while (scanner.hasNextLine()) {
//             scanner.nextLine();
//             lineCount++;
//         }

//         // Close the scanner
//         scanner.close();

//         return lineCount;
//     }

//     public static void main(String[] args) {
//         // Check if files are provided in the command line arguments
//         if (args.length == 0) {
//             System.out.println("No files specified. Please provide file names as arguments.");
//             return;
//         }

//         // Process each file provided in the command line arguments
//         for (String fileName : args) {
//             try {
//                 // Count lines in the file
//                 int lineCount = countLinesInFile(fileName);
//                 System.out.println(fileName + ": " + lineCount + " lines");

//             } catch (IOException e) {
//                 // Print error message if there is an issue reading the file
//                 System.out.println("Error reading file: " + fileName + " (" + e.getMessage() + ")");
//             }
//         }
//     }
// }


// ----------------------------

import java.io.*;

public class P27 {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("No file Found!");
        } else {

            for (int i = 0; i < args.length; i++) {
                try {
                    BufferedReader f = new BufferedReader(new FileReader(args[i]));
                    String j;
                    int count = 0;
                    while ((j = f.readLine()) != null) {
                        count++;
                    }
                    System.out.println("File name is : " + args[i] + " and Number of lines are : " + count);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("ID :23DCS078_KRISH PATEL");        
    }
}
