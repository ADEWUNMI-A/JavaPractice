package Chapter7;

public class QuickProgram {
   public static void main(String[]args){
       String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
       System.out.printf("%s%25s%n", "No", "Days of the week");
       for(int index = 0; index < days.length; index++){
           System.out.printf("%2d%20s%n", index +1, days[index]);
       }

   }
}