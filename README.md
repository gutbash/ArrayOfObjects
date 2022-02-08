# ArrayOfObjects
Program for importing, parsing, reading, and searching for college sections utilizing multiple classes approach.

### Features

- **`Main:`** An executable class for the project itself. Creates a new course list, loads the sections into the course list from a .txt file, then prompts the user to search for a section through a Course Record Number (CRN).

- **`Section:`** A class for creating sections. Each section object features properties of a section, such as the subject, credits offered, a unique CRN identifier, and more. Also included are optional getter and setter mutator methods for each property.

- **`CourseList:`** The course list class serves to store sections (as `Section` objects) in an array and search through that array. First, this class features an array of type `Section` that stores the sections. There is also a count property that tracks the number of sections that are fed into the array.

  There are also two methods. `loadSections()` imports a given .txt file, parses the information, formats it, then prints it out. The second method, `findCrn()`, uses a simple linear search algorithm to loop through each Section object in the array and match that `Section` CRN property to a given user's CRN input they desire to see.
