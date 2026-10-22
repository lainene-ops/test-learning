import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random(1);
        int answer = random.nextInt(100) + 1; // 1 到 100

        Scanner sc = new Scanner(System.in, Charset.forName("GBK"));
        // System.out.println("答案：" + answer);
        boolean guessed = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("第" + i + "次，请输入数字：");
            if (!sc.hasNextInt()) {
                System.out.println("请输入数字");
                sc.nextLine();
                continue;
            }
            int guess = sc.nextInt();
            if (guess == answer) {
                System.out.println("猜中了！");
                guessed = true;
                break;
            } else if (guess > answer) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
        }
        if (!guessed) {
            System.out.println("没猜中，答案是：" + answer);
        }
    }
}
