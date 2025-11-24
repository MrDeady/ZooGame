package zoo.enclosures;

import zoo.animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private String name;
    private double area;
    private List<Animal> animals;
    
    public Enclosure(String name, double area) {
        this.name = name;
        this.area = area;
        this.animals = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " добавлен в вольер " + name);
    }
    
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        System.out.println(animal.getName() + " удален из вольера " + name);
    }
    
    public void showAnimals() {
        System.out.println("Животные в вольере " + name + ":");
        for (Animal animal : animals) {
            System.out.println("  - " + animal);
        }
    }
    
    // Геттеры
    public String getName() { return name; }
    public double getArea() { return area; }
    public List<Animal> getAnimals() { return new ArrayList<>(animals); }
}