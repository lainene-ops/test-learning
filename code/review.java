import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int max, min, sum = 0;

        System.out.println("请输入5个整数：");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];

            if (i == 0) {
                max = numbers[i];
                min = numbers[i];
            } else {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }

        double average = (double) sum / 5;

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("平均值：" + average);
    }
}
