import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean running =true;
     while(running){
         String input=sc.nextLine();
         String words[]=input.split(" ");
         try {
             switch (words[0]) {
                 case "add_classroom":
                     ClassRoom cr = new ClassRoom(words[1]);
                     ClassRoomService.getInstance().addClassRoom(cr);
                     break;
                 case "add_student":
                     Student student = new Student(Integer.parseInt(words[1]), words[2]);
                     StudentService.getInstance().addStudent(student);
                     break;
                 case "schedule_assignment":
                     Assignment assignment=new Assignment(words[1],words[2]);
                     AssignmentService.getInstance().scheduleAssignment(assignment);
                     break;
                 case "submit_assignment":
                     AssignmentService.getInstance().submitAssignment(Integer.parseInt(words[1]),words[2],words[3]);
                     break;
                 case "exit":
                     return;
                 default:
                     System.out.println("Enter  the query in correct format\nadd_classroom (class_name)\nadd_student " +
                             "(student_id) (class_name)\nschedule_assignment (class_name) (assignment_details)\nsubmit_assignment " +
                             "(student_id) (class_name) (assignment_details)\nexit");
                     break;
             }
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Exception caught"+e);
             System.out.println("Please Enter the deatails in this format:");
             System.out.println("add_classroom (class_name)\nadd_Student " +
                     "(student_id) (class_name)\nschedule_assignment (class_name) (assignment_details)\nsubmit_assignment " +
                     "(student_id) (class_name) (assignment_details)\nexit");
         }

     }
    }


}