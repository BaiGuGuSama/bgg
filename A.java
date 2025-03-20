public class A {
    public String a(int a, int b) {
        int x;
        if ((a > 9) && (b > 5)) {
            x = a * a * b;
        } else {
            if (a < 0 && b < 0) {
                x = a - b;
            } else {
                x = a + b;
            }
        }
        return "x=" + x;
    }
}
