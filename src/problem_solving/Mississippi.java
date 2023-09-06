package problem_solving;

public class Mississippi {
    public static void main(String[] args) {
        int sCount = 0;
        int iCount = 0;
        String name = "mississippi";
        for(int i = 0; i < name.length(); i++){
            if (String.valueOf(name.charAt(i)).equals("s")){
                sCount++;
            }
            if (String.valueOf(name.charAt(i)).equals("i")){
                iCount++;
            }
        }
        System.out.println(sCount);
        System.out.println(iCount);

    }
}
