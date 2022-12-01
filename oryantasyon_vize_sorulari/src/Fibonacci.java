public class Fibonacci {
    // 10 elamanlı fibonacci dizisi
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 8; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);

        }
    }

}
