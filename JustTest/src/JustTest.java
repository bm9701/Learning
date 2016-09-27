/**
 * Created by bm9701 on 26.09.2016.
 */
public class JustTest {
    public static void fillStack(Stack stack, String fillString) {
        for (int i=0; i < 5; i++) {
            stack.push(fillString + i);
        }
    }

    public static void takeStack(Stack stack) {
        while (stack.size() != 0) {
            System.out.println(stack.peek() + " " +  stack.pop());
        }
    }

    public static void main(String[] args) {
        testIncrement();
        testSplitAndFro();

        ArrayStack arrayStack = new ArrayStack();
        fillStack(arrayStack, "a");
        /*for (int i=0; i < 5; i++) {
            arrayStack.push("a" + i);
        }*/
        System.out.println("ArrayStack:\n" + arrayStack.size());
        takeStack(arrayStack);

        LinkedStack linkedStack = new LinkedStack();
        fillStack(linkedStack, "l");

        System.out.println("linkedStack:\n" + linkedStack.size());
        takeStack(linkedStack);
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

        System.out.println("");
    }

    public static void testSplitAndFro() {
        String str = "Simple string with words";
        for(String a: str.split(" ")) {
            System.out.format("%s_\n", a);
        }
        System.out.println("");
    }
}
