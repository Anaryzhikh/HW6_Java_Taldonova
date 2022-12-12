import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    static HW_6 hw_6 = new HW_6();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int x = new Random().nextInt(10);
            System.out.print(x + "; ");
            hw_6.methodAdd(x);
        }

        System.out.println();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int b = new Random().nextInt(10);
            System.out.print(b + ", ");
            set.add(b);
        }
    }
}
