package string;

public class CountIntigerInString {
    public static void main(String[] args) {
        String str="This is year 2024";
        char [] ch=str.toCharArray();
        int length=ch.length;
        for(int i=0;i<length;i++)
        {
            if(Character.isDigit(ch[i]))
            {
                System.out.print(ch[i]);
            }
        }
    }
    
}
