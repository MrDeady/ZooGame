package zoo.employees;

import zoo.animals.Animal;
import zoo.food.Food;

public class Zookeeper extends Employee {
    private String assignedArea;
    
    public Zookeeper(String name, int experience, double salary, String assignedArea) {
        super(name, experience, salary);
        this.assignedArea = assignedArea;
    }
    
    @Override
    public void work() {
        System.out.println(name + " убирает вольеры в зоне " + assignedArea);
    }
    
    public void feedAnimal(Animal animal, Food food) {
        System.out.println(name + " кормит " + animal.getName());
        animal.eat(food);
    }
    
    public String getAssignedArea() {
        return assignedArea;
    }
}