// Bugs: For loop on line 14 should have i <= 50 besides i < 50; If statement on line 15 should have mod (%) besides division (/); Initials: ES
#include <iostream>
#include <fstream>
using namespace std;

int main() {
    //opens an html file called "numbers.html" and formats headings
    ofstream file;
    file.open("numbers.html");
    file << "<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n";
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    //the for loop loops through the file, adding the value of i into the file
    for (int i = 1; i < 50; i++) {
        if (i / 2 == 0) {
            file << "<tr><td>" << i << "</td><td></td></tr>\n";
        }
        else {
            file << "<tr><td></td><td>" << i << "</td></tr>\n";
        }
    }
    //creates a table
    file << "</table>\n</body>\n</html>";
    file.close();
    ifstream input("numbers.html");
    //prints the output
    cout << input.rdbuf();
    //closes the file
    input.close();
    return 0;
}
