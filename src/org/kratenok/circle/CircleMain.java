package org.kratenok.circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new  Circle();
        circle.setRadius(33);
        System.out.println("Площадь круга: " + circle.getSquare());
    }
}
