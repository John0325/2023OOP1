import java.util.Scanner;
public class A1091359_0324_1{
    public static void main(String[] argv) {
        animal[] animals = new animal[4];
        animals[0]=new animal();
        animals[1]=new animal();
        animals[2]=new animal();
        animals[3]=new animal();

        animals[0].name="雪寶";
        animals[0].height=1.1;
        animals[0].weight=52;
        animals[0].speed=100;
        
        animals[1].name="驢子";
        animals[1].height=1.5;
        animals[1].weight=99;
        animals[1].speed=200;
        
        animals[2].name="安那";
        animals[2].height=1.7;
        animals[2].weight=48;
        animals[2].speed=120;
        
        animals[3].name="愛沙";
        animals[3].height=1.7;
        animals[3].weight=50;
        animals[3].speed=120;
        
        for(int i=0;i<animals.length;i++){
            animals[i].show();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入時間: ");
        int x = scanner.nextInt();
        System.out.print("請輸入加速度: ");
        double y = scanner.nextDouble();

        for(int k=0;k<animals.length;k++){
            System.out.println(animals[k].name+"distance: "+animals[k].distance(x,y));
        }

    }
}
