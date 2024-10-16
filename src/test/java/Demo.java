import java.util.ArrayList;
import java.util.Arrays;

public class Demo
{

    public static void main(String args[]){

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(23);
        arr.add(90);

        System.out.println(arr);

        arr.removeAll(new ArrayList<>(Arrays.asList(10,23,90)));

        System.out.println(arr);



    }
}
