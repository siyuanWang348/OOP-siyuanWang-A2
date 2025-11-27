/**
 * Main class containing demonstration methods for each part
 */
public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo demo = new AssignmentTwo();
        // Run each part demonstration in sequence
        System.out.println("==================================== Part3 Demonstration: Queue Management ====================================");
        demo.partThree();
        System.out.println("\n==================================== Part4A Demonstration: Ride History Management ====================================");
        demo.partFourA();
        System.out.println("\n==================================== Part4B Demonstration: History Sorting ====================================");
        demo.partFourB();
        System.out.println("\n==================================== Part5 Demonstration: Ride Cycle Operation ====================================");
        demo.partFive();
        System.out.println("\n==================================== Part6 Demonstration: Export History to File ====================================");
        demo.partSix();
        System.out.println("\n==================================== Part7 Demonstration: Import History from File ====================================");
        demo.partSeven();
    }

    // Part3: Queue Management Demonstration
    public void partThree() {
        // Create operator
        Employee operator = new Employee("Zhang San", 30, "13800138000", "EMP001", "Roller Coaster Area");
        // Create ride
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrilling", true, operator, 2);

        // Add 5 visitors to queue
        rollerCoaster.addVisitorToQueue(new Visitor("sherry", 25, "13900139001", "VIS001", true));
        rollerCoaster.addVisitorToQueue(new Visitor("Susan", 22, "13900139002", "VIS002", false));
        rollerCoaster.addVisitorToQueue(new Visitor("Alina", 30, "13900139003", "VIS003", true));
        rollerCoaster.addVisitorToQueue(new Visitor("siyuanWang", 18, "13900139004", "VIS004", false));
        rollerCoaster.addVisitorToQueue(new Visitor("Lucy", 28, "13113560313", "VIS005", true));

        // Print queue
        rollerCoaster.printQueue();

        // Remove 1 visitor
        rollerCoaster.removeVisitorFromQueue();

        // Print queue after removal
        System.out.println("\nQueue after removing 1 visitor:");
        rollerCoaster.printQueue();
    }

    // Part4A: Ride History Management Demonstration
    public void partFourA() {
        Ride thunderstorm = new Ride("Thunderstorm Ride", "Extreme Speed", true, null, 4);

        // Add 5 visitors to history
        Visitor v1 = new Visitor("sherry", 24, "13700137001", "VIS006", false);
        Visitor v2 = new Visitor("Susan", 26, "13700137002", "VIS007", true);
        Visitor v3 = new Visitor("Alina", 21, "13700137003", "VIS008", false);
        Visitor v4 = new Visitor("siyuanWang", 35, "13700137004", "VIS009", true);
        Visitor v5 = new Visitor("Lisa", 29, "13113560313", "VIS010", false);

        thunderstorm.addVisitorToHistory(v1);
        thunderstorm.addVisitorToHistory(v2);
        thunderstorm.addVisitorToHistory(v3);
        thunderstorm.addVisitorToHistory(v4);
        thunderstorm.addVisitorToHistory(v5);

        // Check if visitor is in history
        Visitor checkVisitor = new Visitor("Susan", 26, "13700137002", "VIS007", true);
        System.out.println("\nIs visitor " + checkVisitor.getName() + " in ride history? " + (thunderstorm.checkVisitorFromHistory(checkVisitor) ? "Yes" : "No"));

        // Print number of visitors in history
        System.out.println("Total visitors in ride history: " + thunderstorm.numberOfVisitors());

        // Print ride history
        thunderstorm.printRideHistory();
    }

    // Part4B: History Sorting Demonstration
    public void partFourB() {
        Ride logFlume = new Ride("Log Flume", "Water Ride", true, null, 6);

        // Add 5 visitors to history
        logFlume.addVisitorToHistory(new Visitor("sherry", 22, "13600136001", "VIS011", false));
        logFlume.addVisitorToHistory(new Visitor("Susan", 18, "13600136002", "VIS012", true));
        logFlume.addVisitorToHistory(new Visitor("Alina", 22, "13600136003", "VIS013", true));
        logFlume.addVisitorToHistory(new Visitor("siyuanWang", 30, "13600136004", "VIS014", false));
        logFlume.addVisitorToHistory(new Visitor("Eve", 18, "13113560313", "VIS015", false));

        // Print before sorting
        System.out.println("Ride history before sorting:");
        logFlume.printRideHistory();

        // Sort using custom comparator
        logFlume.sortRideHistory(new VisitorComparator());

        // Print after sorting
        System.out.println("\nRide history after sorting (ascending by age, fast pass first for same age):");
        logFlume.printRideHistory();
    }

    // Part5: Ride Cycle Operation Demonstration
    public void partFive() {
        // Create operator
        Employee operator = new Employee("Li Si", 35, "13500135000", "EMP002", "Water Rides Area");

        // Create ride (maximum 4 people per cycle)
        Ride waterSlide = new Ride("Water Slide", "Water Ride", true, operator, 4);

        // Add 10 visitors to queue
        for (int i = 0; i < 10; i++) {
            waterSlide.addVisitorToQueue(new Visitor(
                    "Visitor" + (i + 1),
                    18 + (i % 20), // Age 18-37
                    "1340013400" + i,
                    "VIS0" + (20 + i),
                    i % 3 == 0 // Fast pass every 3 people
            ));
        }

        // Print queue before operation
        System.out.println("Queue before operation:");
        waterSlide.printQueue();

        // Run 1 cycle
        waterSlide.runOneCycle();

        // Print queue and history after operation
        System.out.println("\nQueue after operation:");
        waterSlide.printQueue();
        System.out.println("\nRide history after operation:");
        waterSlide.printRideHistory();
    }

    // Part6: Export History to File Demonstration
    public void partSix() {
        Ride FerrisWheel = new Ride("Ferris Wheel", "Sightseeing", true, null, 8);

        // Add 5 visitors to history
        FerrisWheel.addVisitorToHistory(new Visitor("sherry", 27, "13300133001", "VIS030", true));
        FerrisWheel.addVisitorToHistory(new Visitor("Susan", 23, "13300133002", "VIS031", false));
        FerrisWheel.addVisitorToHistory(new Visitor("Alina", 25, "13300133003", "VIS032", true));
        FerrisWheel.addVisitorToHistory(new Visitor("siyuanWang", 32, "13300133004", "VIS033", false));
        FerrisWheel.addVisitorToHistory(new Visitor("Sophia", 29, "13113560313", "VIS034", true));

        // Export to CSV file (path can be adjusted as needed)
        FerrisWheel.exportRideHistory("ride_history_export.csv");
    }

    // Part7: Import History from File Demonstration
    public void partSeven() {
        Ride importRide = new Ride("Import Test Ride", "Test", true, null, 5);

        // Import from file exported in Part6
        importRide.importRideHistory("ride_history_export.csv");

        // Verify import result
        System.out.println("Total visitors after import: " + importRide.numberOfVisitors());
        System.out.println("Imported visitor details:");
        importRide.printRideHistory();
    }
}