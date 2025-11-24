package zoo.animals;

import zoo.food.Food;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected boolean isHungry;
    
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isHungry = true;
    }
    
    // Абстрактные методы
    public abstract void makeSound();
    public abstract void eat(Food food);
    public abstract void sleep();
    
    // Конкретные методы
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public boolean isHungry() {
        return isHungry;
    }
    
    @Override
    public String toString() {
        return String.format("%s, возраст: %d лет, вес: %.1f кг", name, age, weight);
    }
}