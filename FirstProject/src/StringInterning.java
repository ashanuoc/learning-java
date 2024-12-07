public class StringInterning {
    public static void main(String[] args) {
        String str = "Jenny";
        String str1 = "Jenny";
        String str3 = new String("Jenny");
        String str4 = new String("Jenny").intern();
        System.out.println(str==str1);
        System.out.println(str==str3);
        System.out.println(str==str3.intern());
        System.out.println(str==str4);
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
