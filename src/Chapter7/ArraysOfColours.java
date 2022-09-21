package Chapter7;

public class ArraysOfColours {

    public static void main(String[] args) {

        String[] colours = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
//        Another way of initialising array variable
//        String [] colours = new String[7];
//           colours[0] = "Red";
//           colours[1] = "Orange";
//           colours[2] = "Yellow";
//           colours[3] = "Green";
//           colours[4] = "Blue";
//           colours[5] = "Indigo";
//           colours[6] = "Violet";
        for (int index = 0; index < colours.length; index++) {
//            System.out.println(colours[index]);
            System.out.println(index + "     " + colours[index]);
        }
        for (int index = 6; index >= 0; index--) {
//            System.out.println(colours[index]);
            System.out.println(index + "     " + colours[index]);
        }
    }

}
