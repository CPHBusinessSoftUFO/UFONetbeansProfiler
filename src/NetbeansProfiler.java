
import java.util.ArrayList;

/**
 * The purpose of NetbeansProfiler is to...
 * @author kasper
 */
public class NetbeansProfiler {
    public static void main( String[] args ) {
        int count = 100;
        int N = 1_000_000;
        for (int i = 0; i<count; i++){
            arraylistInsert(N);
        }
    }
    
    public static ArrayList<Integer> arraylistInsert( int size ) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i<size; i++)
            lst.add(i);
        return lst;
    }
}