public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(8.0);
        Wolf wolf = new Wolf(20.0);

        // Выполнение атаки волка на овцу
        wolf.attack(sheep);

        // Получение здоровья овцы после атаки
        double sheepHealth = sheep.getHealth();
        System.out.println("Здоровье овцы: " + sheepHealth);
    }
}
