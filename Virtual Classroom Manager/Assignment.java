import java.util.HashMap;
import java.util.Map;

public class Assignment {
    String className;
    String assignmentDetails;
    Map<Integer,Boolean> submission=new HashMap<>();
    public Assignment(String className,String assignmentDetails){
        this.className=className;
        this.assignmentDetails=assignmentDetails;
    }
}
