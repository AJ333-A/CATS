//this program defines a students record class that storess students details
//it includes a constructor to initialize the attributes and a method to display them
//contains main method to interact with user
//Done by Joy Ashley Akinyi
class StudentRecord {
    private String studentID;
    private String name;
    private String course;

    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class StudentApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        StudentRecord student = new StudentRecord(studentID, name, course);
        student.displayInfo();
    }
}
