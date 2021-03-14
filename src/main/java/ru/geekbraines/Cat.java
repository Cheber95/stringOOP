package ru.geekbraines;

public class Cat {

    private String name;

    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fed = false;
    }

    public void eat(Plate p) {
        if (fed) {
            // System.out.printf("%s наелся\n", name);
        }
        else {
            if (appetite <= p.getFood()) {
                p.decreaseFood(appetite);
                fed = true;
            } else {
                // System.out.printf("%s: Мяяяяяу, в миске пусто\n", name);
            }
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isFed() {
        return fed;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }
}
