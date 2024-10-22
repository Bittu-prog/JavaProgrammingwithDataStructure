package string;

public class SpecialCharacterInString {
    public static void main(String[] args) {
        
    
    String str="sahghjas@@3687&!#$";
    char [] ch=str.toCharArray();
    int length=ch.length;
    for(int i=0;i<length;i++)
    {
        if(!Character.isWhitespace(ch[i])&& !Character.isLetterOrDigit(ch[i]))
        {
            System.out.print(ch[i]);
        }
    }
}
    
}
