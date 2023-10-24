
//MS BUGS: added wrong variable declaration for line and incorrectly implemented for loop
import java.io.*;

public class even_odd_site {
    
    public static void main(String[] args) throws IOException {
        //Create File to write
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));

        //write HTML header to file
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        //write HTML table to file
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        //For Loop repeats 50 times
        for (int i = 1; i >= 50; i++) {
            //if value is even, write it to table with space after
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            //if value is odd write to table with space before.
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        //write HTML end and close file
        file.write("</table>\n</body>\n</html>");
        file.close();

        //open file "numbers.html"
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));

        //read numbers from file and print
        int line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        //close file
        reader.close();
    }
}
