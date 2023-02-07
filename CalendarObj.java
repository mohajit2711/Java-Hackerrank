// You are using Java
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();
        
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,date,0,0,0);
        Date dateObj = cal.getTime();
        
        System.out.println(dateObj);
    }
}
