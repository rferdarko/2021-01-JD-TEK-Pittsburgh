public class Car {
    public static void main(String[] args) {
        Door dd = new Door(); // Instantiate a new door object from Door class for drivers door (dd)
        dd.name = "Driver"; // Assigns name Driver to door object
        dd.open(); // drivers door is open
        dd.printStatus(); // calls the printStatus method from door class

        Door pd = new Door(); // Creates new door object for passenger door using door class
        pd.name = "Passenger"; // Assignes name Passenger to pd object
        pd.printStatus();  // calls printStatus method from door class since boolean are set to false by default
        pd.open(); // passenger door is open
        pd.printStatus(); // prints status of passenger door
        dd.close(); // drivers door is closed
        dd.printStatus(); // prints status of drivers door

    }
}
