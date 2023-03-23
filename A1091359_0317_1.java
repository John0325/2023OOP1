import java.util.Scanner;
public class A1091359_0317_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入n: ");
        int n=scanner.nextInt();

        System.out.println("請輸入m: ");
        int m=scanner.nextInt();

        int[][] myArray = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                myArray[i][j]=(i+1)*(j+1);
            }
        }

        System.out.println("內容為: ");

        for(int[] a:myArray){
            for(int b:a){
                System.err.println(b+"");
            }
            System.out.println();
        }
    }
}