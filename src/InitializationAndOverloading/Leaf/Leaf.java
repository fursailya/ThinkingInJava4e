package InitializationAndOverloading.Leaf;


public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this; //для возврата ссылки на текущий объект
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
