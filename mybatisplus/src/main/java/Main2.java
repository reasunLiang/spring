import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author : lyx
 * @Date : 2020/10/29 20:12
 * @Version : 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String task = in.nextLine();
        String[] tasks = task.split(",");
        int M = in.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < tasks.length; i++) {
            ts.add(Integer.parseInt(tasks[i]));
        }
        int count = ts.last();
        for (Integer i : ts) {
            M--;
            count += i;
            if (M == 1) {
                break;
            }
        }
        System.out.println(count);
    }
}
