import java.util.Scanner;
public class A1091359_0421_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入電子郵件地址：");
        String input = scanner.nextLine().trim();
        int atPos = input.indexOf('@');
        int dotPos = input.lastIndexOf('.');
        if (atPos <= 0 || dotPos <= atPos || dotPos == input.length() - 1) {
            System.out.println("輸入的電子郵件地址格式不正確。");
            return;
        }
        String username = input.substring(0, atPos);
        String domain = input.substring(atPos + 1, dotPos);
        System.out.println("使用者名稱為：" + username);
        System.out.println("網域為：" + domain);
    }
}
