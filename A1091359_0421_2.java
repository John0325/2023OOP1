import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A1091359_0421_2{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("請輸入日期 (YYYY/MM/DD 或 MM/DD/YYYY):");
            String input = scanner.nextLine();
            Date date = null;
            try {
                if (input.indexOf("/") == 4) {
                    date = new SimpleDateFormat("yyyy/MM/dd").parse(input);
                } else {
                    date = new SimpleDateFormat("MM/dd/yyyy").parse(input);
                }
                System.out.println("輸入的年月日為：" + new SimpleDateFormat("yyyy 年 MM 月 dd 日").format(date));
            } catch (Exception e) {
                System.out.println("輸入的日期格式不正確。");
            }
        }
}
