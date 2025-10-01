import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassRoom {
    String name;
    Map<Integer,Student> studentList;
    List<Assignment>assignmentList;
    public ClassRoom(String name){
        this.name=name;
        studentList=new HashMap<>();
        assignmentList=new ArrayList<>();
    }


}
