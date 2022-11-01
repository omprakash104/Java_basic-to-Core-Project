package functinterface;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLooping {

    public static void main(String args[]) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,50));
        arr1.forEach(x -> System.out.println(x));
    }


}
