package Practices;

public class PalindromeString {
    public static void main(String args[]){

        String str="madam";
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
           // System.out.println("Reverse string is"+rev);



        }  if(rev.equals(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
}
