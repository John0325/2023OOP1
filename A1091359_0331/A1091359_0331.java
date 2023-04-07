import java.util.Scanner;
public class A1091359_0331 {
    public static void main(String[] args) {
        Animal.showInfo();

        Animal snowball = new Animal("雪寶", 1.1, 15, 10);
        Animal donkey = new Animal("驢子", 1.5, 80, 5);
        Human ak = new Human("阿克", 1.9, 70, 20, "男");
        Human hans = new Human("漢斯", 1.7, 80, 18, "男");
        Human anna = new Human("安娜", 1.7, 50, 15, "女");
        Snow elsa = new Snow("艾莎", 1.7, 60, 25, "女", true);
        Snow annaSnow = new Snow("安娜", 1.7, 50, 15, "女", false);

        snowball.show();
        donkey.show();
        ak.show();
        hans.show();
        anna.show();
        elsa.show();
        annaSnow.show();

        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入時間: ");
        int x = scanner.nextInt();
        System.out.print("請輸入加速度: ");
        double y = scanner.nextDouble();

        System.out.println(snowball.name+"distance: "+snowball.distance(x,y));
        System.out.println(donkey.name+"distance: "+donkey.distance(x,y));
        System.out.println(ak.name+"distance: "+ak.distance(x,y));
        System.out.println(hans.name+"distance: "+hans.distance(x,y));
        System.out.println(anna.name+"distance: "+anna.distance(x,y));
        System.out.println(elsa.name+"distance: "+elsa.distance(x,y));
        System.out.println(annaSnow.name+"distance: "+annaSnow.distance(x,y));

    }
}

       
