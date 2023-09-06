package problem_solving;

public class PrintVentures {
    public static void main(String[] args) {
        String name = "ventures";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i % 2 != 0){
                System.out.println();
            }
        }
    }
}
