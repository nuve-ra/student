import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    db.addStudent(new Student(rollNo, name, course));
                    break;
                case 2:
                    db.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    db.searchStudent(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    db.deleteStudent(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Exiting. Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
