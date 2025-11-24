package zoo.animals;

import zoo.food.Food;
import zoo.food.Meat;

public class Lion extends Animal {
    private static final String ROAR = "Ррррр! Я король джунглей!";
    private String furColor;
    
    public Lion(String name, int age, double weight) {
        super(name, age, weight);
        this.furColor = "золотистый";
    }
    
    @Override
    public void makeSound() {
        System.out.println(ROAR);
    }
    
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " с удовольствием ест " + food.getName());
            this.isHungry = false;
            this.weight += food.getCalories() * 0.01;
        } else {
            System.out.println(name + " не ест " + food.getName() + "! Львы - хищники!");
        }
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " спит на солнышке");
    }
    
    public void run() {
        System.out.println(name + " бежит мощной походкой");
    }
    
    public void play() {
        System.out.println(name + " играет с мячом");
    }
    
    public String getFurColor() {
        return furColor;
    }
}