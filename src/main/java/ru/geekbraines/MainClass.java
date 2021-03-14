package ru.geekbraines;

import java.util.Scanner;

public class MainClass {

    private static Cat[] catArray = new Cat[5];
    private static Plate pl1 = new Plate(65);

    public static void main(String[] args) {

        MainClass unit = new MainClass();

        catArray[0] = new Cat("Барсик", 10);
        catArray[1] = new Cat("Жирный Барсик", 20);
        catArray[2] = new Cat("Худой Барсик", 5);
        catArray[3] = new Cat("Папа Васька", 30);
        catArray[4] = new Cat("Котёнок Васька", 2);

        pl1.info();

        unit.feeding();
        unit.plateIncreasment();
        unit.feeding();
    }

    private void plateIncreasment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество еды, которое нужно доложить в миску");
        int foodInc = sc.nextInt();
        pl1.increaseFood(foodInc);
        sc.close();
    }

    private void feeding() {
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(pl1);
            if (catArray[i].isFed()) {
                System.out.println(catArray[i].getName() + " сыт");
            } else {
                System.out.println(catArray[i].getName() + " голодный");
            }
        }
        pl1.info();
    }

}
