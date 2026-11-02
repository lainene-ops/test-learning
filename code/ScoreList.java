import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, Charset.forName("GBK"));
        List<Integer> scores = new ArrayList<>();

        while (true) {
            System.out.println("1-添加 2-查看 3-平均分 4-最高最低 5-删除 0-退出");
            System.out.print("请选择：");
            String choice = sc.nextLine();

            if (choice.equals("0")) {
                System.out.println("已退出");
                break;
            } else if (choice.equals("1")) {
                System.out.print("请输入成绩：");
                String input = sc.nextLine();
                try {
                    int score = Integer.parseInt(input);
                    if (score < 0 || score > 100) {
                        System.out.println("成绩必须在 0-100 之间");
                    } else {
                        scores.add(score);
                        System.out.println("添加成功，当前共 " + scores.size() + " 条");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("请输入数字");
                }
            } else if (choice.equals("2")) {
                if (scores.isEmpty()) {
                    System.out.println("当前没有成绩记录");
                } else {
                    System.out.println("当前成绩：" + scores);
                }0
            } else if (choice.equals("3")) {
                if (scores.isEmpty()) {
                    System.out.println("当前没有成绩记录");
                } else {
                    int sum = 0;
                    for (int score : scores) {
                        sum += score;
                    }
                    double avg = (double) sum / scores.size();
                    System.out.println("平均分：" + avg);
                }
            } else if (choice.equals("4")) {
                if (scores.isEmpty()) {
                    System.out.println("当前没有成绩记录");
                } else {
                    int max = scores.get(0);
                    int min = scores.get(0);
                    for (int score : scores) {
                        if (score > max)
                            max = score;
                        if (score < min)
                            min = score;
                    }
                    System.out.println("最高分：" + max + "，最低分：" + min);
                }
            } else if (choice.equals("5")) {
                if (scores.isEmpty()) {
                    System.out.println("当前没有成绩记录");
                } else {
                    System.out.print("请输入要删除的成绩：");
                    String input = sc.nextLine();
                    try {
                        int score = Integer.parseInt(input);
                        if (scores.remove(Integer.valueOf(score))) {
                            System.out.println("删除成功");
                        } else {
                            System.out.println("没有找到该成绩");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("请输入数字");
                    }
                }
            } else {
                System.out.println("无效选项，请重新输入");
            }
        }
    }
}
