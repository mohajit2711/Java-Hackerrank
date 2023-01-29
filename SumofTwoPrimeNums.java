// You are using Java
import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 2; i <= n/2; i++) {
            if(isPrime(i)) {
                if(isPrime(n-i)) {
                    System.out.println(i + " + " + (n-i));
                }
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}
