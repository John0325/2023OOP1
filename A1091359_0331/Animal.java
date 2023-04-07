public class Animal {
    String name;
    double height;
    double weight;
    double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("身高：" + height + " 公分");
        System.out.println("體重：" + weight + " 公斤");
        System.out.println("速度：" + speed + " 公里/小時");
    }

    public double distance(int time, double acceleration) {
        return time * acceleration * speed;
    }

    public double distance(int time) {
        return distance(time, 0);
    }

    public static void showInfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}