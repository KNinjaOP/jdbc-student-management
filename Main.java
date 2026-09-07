import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while(true){
            System.out.println(
                "\n===== MENU ====="
            );

            System.out.println(
                    "1 Add Student"
            );

            System.out.println(
                    "2 View Students"
            );

            System.out.println(
                    "3 Search Student"
            );

            System.out.println(
                    "4 Update Student"
            );

            System.out.println(
                    "5 Delete Student"
            );

            System.out.println(
                    "6 Exit"
            );

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Course : ");
                    String course = sc.nextLine();

                    dao.addStudent(new Student(id, name, age, course));

                    break;
                
                case 2:
                    dao.viewStudents();

                    break;
                
                case 3:
                    System.out.println("ID : ");

                    dao.searchStudent(sc.nextInt());

                    break;

                case 4:
                    System.out.print("ID : ");

                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("New Course : ");

                    course = sc.nextLine();

                    dao.updateStudent(id, course);

                    break;

                case 5:
                    System.out.print("ID : ");

                    dao.deleteStudent(sc.nextInt());

                    break;
                    
                case 6:
                    System.out.println("Thank You");

                    return;
                
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
