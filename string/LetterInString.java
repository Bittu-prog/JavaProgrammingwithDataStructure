package string;

public class LetterInString {
   

    public static void main(String[] args) {
        String str="dgsahfd132145";
        char[] ch=str.toCharArray();
        int length=ch.length;
        for(int i=0; i<length;i++)
        {
            if(!Character.isDigit(ch[i]))
            {
                System.out.print(ch[i]);
            }
        }
    }
    
}
