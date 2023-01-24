package Chapter14;

public class StringConstructors {
    public static void main(String[] args) {
//        char[] charArray = {'A','d','e','w','u','n','m','i'};
//        String str = new String("Hello");
//
//        String s1 = new String();
//        String s2 = new String(str);
//        String s3 = new String(charArray);
//        String s4 = new String(charArray,3,5);
//
//        System.out.printf("s1= %s%ns2= %s%ns3= %s%ns4= %s", s1, s2, s3, s4);

        String s1 = new String("goodbye");
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) is %d%n%n", s4.compareTo(s3));
        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match");
        }
        System.out.println(s3.trim());
        System.out.println(s3.replace(" ", ""));
    }
}
