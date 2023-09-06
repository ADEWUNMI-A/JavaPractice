package problem_solving;

public class RearrangeAndSorting {
    public static void main(String[] args) {
        int[] arr = {1, 8, 18, 4, 5};
        int max_num = arr[0];
        int next_max = arr[0];

        for(int i: arr){
            if(i > max_num) {
                next_max = max_num;
                max_num = i;
            }
            if ( i > next_max && i < max_num){
            next_max = i;
        }
        }
        System.out.println(next_max);
    }
}
