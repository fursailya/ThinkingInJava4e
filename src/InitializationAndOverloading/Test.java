package InitializationAndOverloading;

/**
 * Created by ghost on 01.11.16.
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded method");
        }

        new Tree();
    }
}
