// You are using Java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String pattern = ".^\\d$";
        
        System.out.println(input);
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        
        if(m.find()) {
            System.out.println("Found a match!");
        } else {
            System.out.println("Not matched!");
        }
    }
}
