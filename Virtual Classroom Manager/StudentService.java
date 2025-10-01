public class StudentService {
    private static StudentService instance=null;
    private  StudentService(){};
    public static synchronized StudentService getInstance(){
        if(instance==null){
            return new StudentService();
        }
        return instance;
    }



    public  void addStudent(Student student){
        ClassRoom crm=ClassRoomService.getInstance().getClassRoom(student.className);
        if(crm==null){
            System.out.println("No such class foun!");
            return;
        }
        if(crm.studentList.containsKey(student.id)){
            System.out.printf("Student %d has already enrolled!\n",student.id);
        }
        crm.studentList.put(student.id, student);
        System.out.printf("Student %d has been enrolled in %s.\n",student.id,student.className);

        //previous scheduled assignment
        if(crm.assignmentList!=null){
            for (Assignment assignment : crm.assignmentList) {
                assignment.submission.put(student.id, false);
            }

        }
    }

}
