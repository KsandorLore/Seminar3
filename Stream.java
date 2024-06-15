
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// import java.util.Iterator;
// import java.util.List;

// public class Stream implements Iterable<StudentGroup>{

//     private String name;
//     private List<StudentGroup> groups;

//     public Stream(String name, List<StudentGroup> groups){

//         this.name = name;
//         this.groups = groups;

//     }

//     public String getName(){
//         return name;
//     }

//     public List<StudentGroup> getGroups(){
//         return groups;
//     }



//     @Override
//     public Iterator<StudentGroup> iterator() {
//         return groups.iterator();    
//     }

// }



public class Stream implements Iterable<StudentGroup>{

    private List<StudentGroup> groups;

    public Stream() {
        groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group){
        groups.add(group);
        
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();   
    }

    public List<StudentGroup> getGroups(){
                return groups;
            }

    

    
}