import java.io.*;
     public class Solution {
 
// Mohajit Paul (20BCE10630)
 
    private static final Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int N = scanner.nextInt();
        String ans = "";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2==1){
            ans = "Weird";
        }
        else {
            if (N>=2 && N<=5){
                ans = "Not Weird";
            }
            if(N>=6 && N<=20){
               ans = "Weird";
            } 
            
            else{
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
