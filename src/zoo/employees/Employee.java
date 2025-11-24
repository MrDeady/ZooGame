package zoo.employees;

public abstract class Employee {
    protected String name;
    protected int experience;
    protected double salary;
    
    public Employee(String name, int experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    
    public abstract void work();
    
    public String getName() {
        return name;
    }
    
    public int getExperience() {
        return experience;
    }
    
    public double getSalary() {
        return salary;
    }
}