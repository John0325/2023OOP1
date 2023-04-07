public class Snow extends Human {
    boolean hasFreezingSkill;

    public Snow(String name, double height, double weight, double speed, String gender, boolean hasFreezingSkill) {
        super(name, height, weight, speed, gender);
        this.hasFreezingSkill = hasFreezingSkill;
    }

    public void show() {
        super.show();
        System.out.println("冰凍技能：" + (hasFreezingSkill ? "YES" : "NO"));
    }

    public double distance(int time, double acceleration) {
        return super.distance(time, acceleration) * 2;
    }

    public double distance(int time) {
        return distance(time, 0);
    }
}
