package Practices;

public class ReverseString {
    public static void main(String args[]){
        String str="Priyanvada Deshmukh";
        String[] s=str.split(" ");
        String re="";
        String word;
        for(int i=0;i<=s.length-1;i++){
            //System.out.println("Values is  "+s[i]);
            word=s[i];
            String revW="";
            for(int j=word.length()-1;j>=0;j--){
                revW+=word.charAt(j);
            }re+=revW+" ";


        }System.out.println(re);
    }
}
