
import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream s1, Stream s2) {
        
        int amountGroups1 = s1.getGroups().size();
        int amountGroups2 = s2.getGroups().size();


        return Integer.compare(amountGroups1, amountGroups2);
        
    }




}
