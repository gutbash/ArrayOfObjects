// ArrayOfObjects.java
// program for importing, creating, and reading college sections for CSCI 112
// last edited Feb. 6, 2022 by S. Gutierrez

package ArrayOfObjects;

// imports io for writing and export and scanner for import
import java.io.*;
import java.util.Scanner;

// An executable class for the project itself.
// Creates a new course list, then loads the sections into the course list from a .txt file.
// Finally, prompts the user to search for a section through a Course Record Number (CRN).
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // instantiates CourseList object
        CourseList spring2022 = new CourseList();

        // prints the list of sections
        spring2022.loadSections();

        // prompts user for crn search
        spring2022.findCrn();

    }
}
