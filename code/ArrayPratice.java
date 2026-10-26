
public class ArrayPratice {
    public static void main(String[] args) {
        int scores[] = { 59, 60 };
        if (scores == null) {
            System.out.println("数组为空");
        } else {
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i];
            }
            System.out.println("总分数为：" + sum);
            double averge = (double) sum / scores.length;
            System.out.printf("平均分为：%.2f%n", averge);
            int max = scores[0];
            for (int j = 1; j < scores.length; j++) {
                if (scores[j] > max) {
                    max = scores[j];
                }
            }
            System.out.println("最高分为：" + max);
            int min = scores[0];
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] < min) {
                    min = scores[i];
                }
            }
            System.out.println("最低分为：" + min);
            int passcount = 0;
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] >= 60) {
                    passcount++;
                }
            }
            System.out.println("及格人数为：" + passcount);
        }
        int[] values = new int[3];
        System.out.println(values[3]);
    }
}
