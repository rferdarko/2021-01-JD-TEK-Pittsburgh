public class Door {     // creates a class for the Door object
    String name;  // using a name String
    boolean isOpen; // boolean value for isOpen

    void open() {    // if door is open
        isOpen = true;  // isOpen is true
    }

    void close() {    // if door is closed
        isOpen = false;  // isOpen is false
    }

    void printStatus() {  // method to print status of door
        if (isOpen) {  // if the door is open
            System.out.println(name + " door is open.");
            // print, the name of the door from main method and door open
        }
        else { // otherwise the door is closed
            System.out.println(name + " door is closed.");
            // print name of door from main and door is closed status
        }
    }
}
