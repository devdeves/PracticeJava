package prototype.classmatesNotebook;

import prototype.student.Student;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
//    private Map<String , Student> map = new HashMap<>();
//
//    public void register(String key , Student prototype){
//        map.put(key, prototype);
//    }
//
//    public Student get(String key){
//        return map.get(key);
//    }
    private Map<String ,Notebook> map = new HashMap<>();

    public Notebook get(String key){
        return map.get(key);
    }
    public void register(String key ,Notebook prototype){
    map.put(key,prototype);
    }

}


