
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StudentManager studentManager = new StudentManager();
      int choice;


      do{
          System.out.println("--STUDENT MANAGEMENT SYSTEM--");
          System.out.println("1. Add Student");
          System.out.println("2. View Students");
          System.out.println("3. Search Student");
          System.out.println("4. Update Student");
          System.out.println("5. Delete Student");
          System.out.println("6. Exit");

          System.out.println("Enter your Choice: ");
          choice = sc.nextInt();
          sc.nextLine();

          switch (choice){
              case 1:
                  System.out.println("Enter Student Name: ");
                  String name = sc.nextLine();

                  System.out.println("Enter Student Age: ");
                  int age = sc.nextInt();
                  sc.nextLine();

                  System.out.println("Enter Student ID Number: ");
                  int studID = sc.nextInt();
                  sc.nextLine();

                  System.out.println("Enter Course: ");
                  String course = sc.nextLine();

                  System.out.println("Enter Semester: ");
                  int semester = sc.nextInt();
                  sc.nextLine();

                  Student student = new Student(name,age,studID,course,semester);
                  studentManager.addStudent(student);

                  break;

              case 2:
                  studentManager.viewAllStudents();
                  break;

              case 3:
                  System.out.println("Enter Student ID Number: ");
                  int rn = sc.nextInt();
                  studentManager.searchStudent(rn);
                  break;

              case 4:
                  System.out.println("Enter ID Number of the Student: ");
                  int ID = sc.nextInt();
                  sc.nextLine();

                  System.out.println("Update the Credentials for ID Number: "+ID);

                  System.out.println("Enter Student Name: ");
                  String updatedName = sc.nextLine();

                  System.out.println("Enter Student Age: ");
                  int updatedAge = sc.nextInt();
                  sc.nextLine();


                  System.out.println("Enter Course: ");
                  String updatedCourse = sc.nextLine();

                  System.out.println("Enter Semester: ");
                  int updatedSemester = sc.nextInt();
                  sc.nextLine();

                  studentManager.update(updatedName,updatedAge,ID,updatedCourse,updatedSemester);
                  break;

              case 5:
                  System.out.println("Enter Student ID for the deletion of Student data: ");
                  int id = sc.nextInt();
                  studentManager.deleteStudentData(id);
                  break;
              case 6:
                  System.out.println("Exiting.......");
                  break;
              default:
                  System.out.println("Invalid Choice");


          }

      }while(choice !=6);
      sc.close();

    }
}