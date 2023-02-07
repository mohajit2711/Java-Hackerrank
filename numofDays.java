// You are using Java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(end>start){
            for(int i = start; i<=end ; i++) {
                if(isLeap(i)){
                    System.out.println("Year: " + i + " = 366");
                } else {
                    System.out.println("Year: " + i + " = 365");
                }
            }
        } else {
            System.out.println("End year must be greater than first year!");
        }
    }
    
    public static boolean isLeap(int year) {
        return year%4 == 0 && (year%100 != 0 || year%400 == 0);
    }
}
