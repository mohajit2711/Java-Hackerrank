// You are using Java
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String pattern = "[aeiouAEIOU]";
        
        System.out.println("Original string: " + input);
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        
        int count = 0;
        
        while(m.find()) {
            count++;
        }
        
        System.out.println("New String: " + count);
    }
}
