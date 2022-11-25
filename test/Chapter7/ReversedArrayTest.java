package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedArrayTest {

      @Test
    public void reverseArrayTest(){
          int[] array = {1, 2, 3, 4, 5};
          int[] reversedArray = ReversedArray.reverse(array);
          assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reversedArray);
      }

      @Test
      public void reverseStringTest(){
          String userInput = "Adewunmi";
          String reversedUserInput = ReversedArray.reverse(userInput);
          assertEquals("imnuwedA", reversedUserInput);
      }

      @Test
    public void capitalize(){
          String userInput = "jerry";
          String capitalizedWord = ReversedArray.capitalize(userInput);
          assertEquals("Jerry", capitalizedWord);
      }
}
