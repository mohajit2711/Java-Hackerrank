// You are using Java
import java.util.*;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m == 2) {
            System.out.println("The 2nd month is a February and have 28 days. \n");
            System.out.println("In leap year The February month Have 29 days.");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println("Month have 30 days.");
        } else {
            System.out.println("Month have 31 days.");
        }
    }
}
