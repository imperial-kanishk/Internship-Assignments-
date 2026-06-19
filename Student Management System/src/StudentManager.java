import java.util.ArrayList;

public class StudentManager {
   private ArrayList<Student> studentList = new ArrayList<>();

    void addStudent(Student  s){
        for(Student student : studentList){
            if(student.getStudentID() == s.getStudentID()){
                System.out.println("Student ID already exists!");
                return;
            }
        }
        studentList.add(s);
        System.out.println("Added Successfully");

    }
    void viewAllStudents(){
        if(studentList.isEmpty()){
            System.out.println("No records found");
        }
        else{
            System.out.println("List of Students:- ");
        for (Student s:studentList){
            System.out.println(s);
            System.out.println();
        }}
    }
    void searchStudent(int id){
        boolean found = false;
        for (Student s:studentList){
            if(id == s.getStudentID()) {
                found = true;
                System.out.println(s);
                break;
            }
        }
        if(!found){
            System.out.println("No record found");
        }

    }
    void update(String name, int age, int studentID, String course, int semester ){
        boolean found=false;
       for(Student s : studentList){
           if(studentID == s.getStudentID()){
               found = true;
               s.setName(name);
               s.setSemester(semester);
               s.setAge(age);
               s.setCourse(course);
                break;
           }

       }
       if(found)
       { System.out.println("Updated Successfully");}
       else{
           System.out.println("Student Not Found");
       }


    }

    void deleteStudentData(int studID){

        boolean removed = studentList.removeIf(student -> student.getStudentID() == studID);

        if (removed) {
            System.out.println("Successfully Deleted");
        }
        else
            System.out.println("Student not found");
    }




}
