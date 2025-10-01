import java.util.Map;

public class AssignmentService {
    private static AssignmentService instance=null;
    private AssignmentService(){};
    public static synchronized AssignmentService getInstance(){
        if(instance==null)return new AssignmentService();
        return instance;
    }



    public  void scheduleAssignment(Assignment assignment){
        ClassRoom crm=ClassRoomService.getInstance().getClassRoom(assignment.className);
        if(crm==null){
            System.out.println("NO such class found!");
            return;
        }
        crm.assignmentList.add(assignment);
        System.out.printf("Assignment for %s has been scheduled.\n",assignment.className);
        for(Map.Entry<Integer, Student> entry:crm.studentList.entrySet()){
            int id= entry.getKey();
            assignment.submission.put(id,false);
        }

    }
    public  void submitAssignment(int id,String className,String assignment){
        ClassRoom crm=ClassRoomService.getInstance().getClassRoom(className);
        if(crm==null){
            System.out.println("No such class found!");
            return;
        }
        if(!crm.studentList.containsKey(id)){
            System.out.println(id+" not enrolled in the "+className);
            return;
        }
        Assignment assignmen=null;
        for(Assignment assignment1: crm.assignmentList){
            if(assignment1.assignmentDetails.equals(assignment)){
                assignmen=assignment1;
                break;
            }
        }
        if(assignmen==null){
            System.out.println(assignment+" is not scheduled in the "+className);
            return;
        }
        if(assignmen.submission.get(id)){
            System.out.println("Assignment has been already submitted");
            return;
        }
        assignmen.submission.put(id,true);
        System.out.printf("Assignment submitted by Student %d in %s.\n",id,className);


    }



}
