public class animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("name: "+name+"height: "+height+"weight: "+weight+"speed: "+speed);
    }

    double distance(int x, double y){
        double distance = x*y*speed;
        return distance;
    }

    double distance(int x){
        double distance=x*speed;
        return distance;
    }
} 
