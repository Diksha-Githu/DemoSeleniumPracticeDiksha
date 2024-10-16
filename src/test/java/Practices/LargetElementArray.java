package Practices;

public class LargetElementArray {

    public static void main(String args[]) {
        System.out.println("Start a program");

        int[] arr = {13, 90, 70, 80, 60, 40,100};
        int larg=arr[0];

        for(int num:arr){
            if(num>larg){
                larg=num;

            }
        }System.out.println(larg);

    }
}
