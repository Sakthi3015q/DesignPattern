import java.util.HashMap;
import java.util.Map;

public class ClassRoomService {
    private static ClassRoomService instance;
    private static   Map<String,ClassRoom>classRoomMap=new HashMap<>();
    private ClassRoomService(){};
    public static synchronized ClassRoomService getInstance() {
        if (instance == null) instance = new ClassRoomService();
        return instance;
    }

    public  void addClassRoom(ClassRoom classRoom){
        classRoomMap.put(classRoom.name,classRoom);
        System.out.printf("Classroom %s has been created.\n",classRoom.name);
    }

    public  ClassRoom getClassRoom(String className){
        if(classRoomMap.containsKey(className)){
            return classRoomMap.get(className);
        }
        return null;
    }




}
