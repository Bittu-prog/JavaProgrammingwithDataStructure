package string;

public class ReverseTheStringWithoutLoop {
    public static void main(String[] args) {
        String str="The Dog is pretty";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse().toString();
        System.out.println(sb);

    }
    
}
