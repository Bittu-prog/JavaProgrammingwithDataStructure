package string;

public class ReverseString {
    public static void main(String[] args) {
        String str="this is linux";
        String[] splitstr=str.split(" ");
        String newstr="";
        int length=splitstr.length;
        for(int i=length-1;i>=0;i--)
        {
            newstr=newstr+splitstr[i]+" ";
        }
        System.out.println(newstr);
    }
    
}
