//вариант 1
abstract class Animal {
    protected double health;
    protected double x;
    protected double y;
    protected double z;
    //для хранения положения в трехмерном пространстве

    public Animal(double health) {
        this.health = health;
    }

    public abstract void attack(Animal target);

    protected void reduceHealth(Animal target, double damage) {
        target.health -= damage;
    }

    public double getHealth() {
        return health;
    }
}

class Sheep extends Animal {
    public Sheep(double health) {
        super(health);
    }

    @Override
    public void attack(Animal target) {
        // Овца не может атаковать
        System.out.println("Овца не может атаковать");
    }
}

class Wolf extends Animal {
    private static final double MAX_HEALTH = 20.0;
    private static final double DAMAGE = 4.0;

    public Wolf(double health) {
        super(health);
    }

    @Override
    public void attack(Animal target) {
        // Расстояние от волка до овцы
        double distance = Math.pow( Math.sqrt(Math.pow(target.x - this.x, 2) + Math.pow(target.y - this.y, 2) + Math.pow(target.z - this.z, 2)),2);

        // Вычисление урона волка по формуле
        double damage = ((MAX_HEALTH / health) * (health / 2.0));

        // Уменьшение здоровья цели на урон
        reduceHealth(target, damage);
    }
}

