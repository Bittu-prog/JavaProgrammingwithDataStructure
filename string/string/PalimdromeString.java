package string;
import java.util.Scanner;

public class PalimdromeString {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Word which you want to check");
            String A=sc.next();
            StringBuilder str=new StringBuilder(A);
            if(A.equals(str.reverse().toString()))
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
    }
    
}
