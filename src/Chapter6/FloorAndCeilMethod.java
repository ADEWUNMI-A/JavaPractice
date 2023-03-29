package Chapter6;



public class FloorAndCeilMethod {

   public static int ceilMethod(double number){
      String num = String.valueOf(number);
      String[] newNum = num.split("\\.");
      String ceilNum = newNum[0];
              return Integer.parseInt(ceilNum);
   }
   public static int floorMethod(double number){
      String num = String.valueOf(number);
      String[] newNum = num.split("\\.");
      String numb = newNum[0];
      return Integer.parseInt(numb) + 1;
   }

   public static void main(String[] args) {
      double num1 =  67.9;
      System.out.println(FloorAndCeilMethod.ceilMethod(num1));
      System.out.println(FloorAndCeilMethod.floorMethod(num1));

   }
}
