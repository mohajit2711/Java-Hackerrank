// You are using Java
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        
        LocalDate firstDate = LocalDate.parse(date1, formatter);
        LocalDate secondDate = LocalDate.parse(date2, formatter);
        
        if(firstDate.isEqual(secondDate))
            System.out.println(date1 + " is equal to " + date2);
        else 
            System.out.println(date1 + " is " + (firstDate.isBefore(secondDate)?"less than":"greater than") + " " + date2);
        
    }
}
