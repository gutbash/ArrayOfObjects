// ArrayOfObjects.java
// program for importing, creating, and reading college sections for CSCI 112
// last edited Feb. 6, 2022 by S. Gutierrez

package ArrayOfObjects;

// imports io for writing and export and scanner for import
import java.io.*;
import java.util.Scanner;

// The course list class serves to store sections (as Section objects) in an array and search through that array.
// First, this class features an array of type Section that stores the sections.
// There is also a count property that tracks the number of sections that are fed into the array.
public class CourseList {

    // properties
    Section[] sections = new Section[2000]; // array with 2000 limit stores sections of Section obj type
    int count = 0; // counts every time a new section is indexed into the sections array

    // constructor
    CourseList() {

        this.sections = sections;
        this.count = count;

    } // end CourseList()

    // loadSections() method imports a given .txt file, parses the information, formats it, then prints it out.
    public void loadSections() throws FileNotFoundException {

        // starts reading data message and prints heading
        System.out.println("reading from the data file...\n");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-20s %-10s %-10s %-10s %-10s\n", "CRN", "SUBJECT", "COURSE", "SECTION", "CREDITS", "TIME", "DAYS", "ROOM", "MAX", "ENROLLED");

        // specifies path for import file in project folder
        File x = new File("spring2022.txt");

        // creates scanner object to receive information
        Scanner y = new Scanner(x);

        // initializes loop for reading file
        for (int i=0; i < 2000; i++) {

            // checks if file does not have a next line, breaks loop if true
            if (!(y.hasNextLine())) {

                break;

            } // end if

            // assigns each line to its corresponding property
            String crn = y.nextLine();
            String sub = y.nextLine();
            String crse = y.nextLine();
            String sec = y.nextLine();
            int cr = Integer.parseInt(y.nextLine());
            String time = y.nextLine();
            String days = y.nextLine();
            String room = y.nextLine();
            int max = Integer.parseInt(y.nextLine());
            int enr = Integer.parseInt(y.nextLine());

            // creates Section object with prior properties at sections[i]
            sections[i] = new Section(crn, sub, crse, sec, cr, time, days, room, max, enr);

            // invokes toString method (formatting is in toString method)
            System.out.print(sections[i].toString());

            // increases count of Section objects in array
            count++;

        } // end for

        // prints count of sections in given CourseList object's array
        System.out.println("\nCourse list has loaded with " + count + " sections...\n");

        // close scanner stream
        y.close();

    } // end loadSections()

    // uses a simple linear search algorithm to loop through each Section object in the array and match that Section CRN property to a given user's CRN input they desire to see.
    public void findCrn() throws FileNotFoundException {

        // creates a new Scanner class object, associated with console input
        Scanner kb = new Scanner(System.in);

        // prompts user for input of desired CRN and stores result in targetCrn
        System.out.print("Find a section/course by entering its Course Record Number (CRN): ");
        String targetCrn = kb.next();

        // specifies path for import file in project folder
        File x = new File("spring2022.txt");

        // creates scanner object to receive information
        Scanner y = new Scanner(x);

        // loops through sections array to find targetCrn
        for (Section obj : sections) {

            // checks if the current obj in the sections array iteration has no value
            if (obj == null) {

                // break loop if obj is null
                break;

            } // end if

            // matches section crn to user input target crn
            if ((obj.crn).equals(targetCrn)) {

                // toString() section if obj's crn is equal to targetCrn and prints the course's toString() with headings
                System.out.print("\n");
                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-20s %-10s %-10s %-10s %-10s\n", "CRN", "SUBJECT", "COURSE", "SECTION", "CREDITS", "TIME", "DAYS", "ROOM", "MAX", "ENROLLED");
                System.out.println(obj.toString());

                // prompts to search again and stores choice input in restart0
                System.out.print("Would you like to search again? [Y/N]: ");
                String restart0 = kb.next();

                // calls findCrn() again if yes and returns the method if anything else
                if (restart0.equals("Y") || restart0.equals("y")) {

                    System.out.print("\n");
                    this.findCrn();

                } else if (restart0.equals("N") || restart0.equals("n")){

                    return;

                } else {

                    return;

                } // end if, else if, else

            } // end if

        } // end for loop

        // prints error message if user input does not match any CRN
        System.out.println("\nThe system was unable to find a course associated with the given CRN number...");

        // asks user to retry and stores result in restart1
        System.out.print("\nWould you like to try again? [Y/N]: ");
        String restart1 = kb.next();

        // calls findCrn() again if yes and returns the method if anything else
        if (restart1.equals("Y") || restart1.equals("y")) {

            System.out.print("\n");
            this.findCrn();

        } else {

            return;

        } // end if and else

        // close scanner stream
        y.close();

        // close scanner for input
        kb.close();

    } // end findCrn()

} // end CourseList()
