package Practices;

public class DpliacteArray {
    public static void main(String args[]) {
        System.out.println("Start a program");

        int[] arr = {13, 90, 70, 80, 60, 40, 100, 80, 20,100};
        System.out.println(arr.length);
for(int i=0;i<arr.length;i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            arr[j] = arr[i];

            System.out.println("Dupl num is" + arr[j]);
        }
    }

}}
    }


