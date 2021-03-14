package ru.geekbraines;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        setFood(food -= n);
    }

    public void increaseFood(int n) {
        setFood(food += n);
    }

    private void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
