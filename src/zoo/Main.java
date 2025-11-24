package zoo;

import zoo.animals.Lion;
import zoo.animals.Penguin;
import zoo.employees.Zookeeper;
import zoo.enclosures.Enclosure;
import zoo.food.Meat;
import zoo.food.Fish;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДОБРО ПОЖАЛОВАТЬ В НАШ ЗООПАРК! ===\n");
        
        // Создаем животных
        Lion simba = new Lion("Симба", 5, 190);
        Penguin kowalski = new Penguin("Ковальски", 3, 25);
        
        // Создаем сотрудников
        Zookeeper ivan = new Zookeeper("Иван", 3, 50000, "Африка");
        
        // Демонстрация работы зоопарка
        System.out.println("--- Демонстрация животных ---");
        simba.makeSound();
        kowalski.makeSound();
        
        System.out.println("\n--- Кормление животных ---");
        ivan.feedAnimal(simba, new Meat());
        ivan.feedAnimal(kowalski, new Fish());
    }
}