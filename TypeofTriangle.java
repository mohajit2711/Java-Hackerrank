// You are using Java
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        
        if(set.size() == 1) System.out.println("This is an equilateral triangle.");
        else if (set.size() == 2) System.out.println("This is an isoceles triangle.");
        else System.out.println("This is a scalene triangle.");
    }
}
