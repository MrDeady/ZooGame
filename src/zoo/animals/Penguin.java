package zoo.animals;

import zoo.food.Food;
import zoo.food.Fish;

public class Penguin extends Animal {
    private double wingspan;
    private boolean canFly;
    
    public Penguin(String name, int age, double weight) {
        super(name, age, weight);
        this.wingspan = 0.5;
        this.canFly = false;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Кря-кря! Я пингвин!");
    }
    
    @Override
    public void eat(Food food) {
        if (food instanceof Fish) {
            System.out.println(name + " ловко ловит и ест " + food.getName());
            this.isHungry = false;
            this.weight += food.getCalories() * 0.005;
        } else {
            System.out.println(name + " не ест " + food.getName() + "! Пингвины едят только рыбу!");
        }
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " спит стоя");
    }
    
    public void fly() {
        System.out.println(name + " не может летать, но отлично плавает!");
    }
    
    public void play() {
        System.out.println(name + " весело скатывается с горки на животе");
    }
    
    public void swim() {
        System.out.println(name + " грациозно плавает в воде");
    }
    
    public double getWingspan() {
        return wingspan;
    }
    
    public boolean canFly() {
        return canFly;
    }
}