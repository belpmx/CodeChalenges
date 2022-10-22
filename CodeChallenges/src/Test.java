//array or coolection 5 numbers
//print in order
//print largest
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        //  int [] myArray = {2,5,20,50,1};
        List<Integer> myArrayList = new ArrayList<Integer>();
        List<Integer> myArrayOrder = new ArrayList<Integer>();
        int size = 0;

        myArrayList.add(2);
        myArrayList.add(5);
        myArrayList.add(20);
        myArrayList.add(50);
        myArrayList.add(1);

        myArrayOrder = myArrayList.stream().sorted().toList();
        size = myArrayOrder.size();

        for (int i = size-1; i>=0 ; i--){
            System.out.print(myArrayOrder.get(i)+" ");
        }
    }
}