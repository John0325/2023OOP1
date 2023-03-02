import java.util.Scanner;

public class A1091359_0224_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度: ");
        int number = scanner.nextInt();
        System.out.println("華氏溫度為: " + (number * 9/5 + 32));
        
    }    
}