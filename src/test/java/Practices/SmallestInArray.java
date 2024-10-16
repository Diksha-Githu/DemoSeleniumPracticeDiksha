package Practices;

public class SmallestInArray {
    public static void main(String args[]) {
        System.out.println("Start a program");

        int[] arr = {13, 90, 70, 80, 60, 40, 100,1};
        int small=arr[0];

        for(int num:arr){
            if(num<small){
                small=num;
            }

        }System.out.println(small);


    }

}
