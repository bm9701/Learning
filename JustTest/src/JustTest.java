/**
 * Created by bm9701 on 26.09.2016.
 */
public class JustTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        for (int i=0; i < 5; i++) {
            stack.push("a" + i);
        }
        System.out.println("ArrayStack:\n" + stack.size());
        while (stack.size() != 0) {
            System.out.println(stack.peek() + " " +  stack.pop());
        }

        testIncrement();
        testSplitAndFro();
    }

    public static void testIncrement() {
        System.out.println("Test Increment 1:");
        int x = 3;
        System.out.println("x = 3; ++x + x++ = " + (++x + x++));
        System.out.println("x = " + x);
        x = ++x + x++;
        System.out.println("++x + x++; x = " + x);
        System.out.println("Test Increment 2:");

        System.out.println("x++ - ++x = " + (x++ - ++x));
        System.out.println("x = " + x);
    }

    public static void testSplitAndFro() {
        String str = "Simple string with words";
        for(String a: str.split(" ")) {
            System.out.format("%s_\n", a);
        }
    }
}
