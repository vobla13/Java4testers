package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    // Вычисляем расстояние между двумя точками
    Point p1 = new Point(9, -1);
    Point p2 = new Point(2, -25);

    System.out.println("Расстояние между p1 и p2 = " + p1.distance(p2));

    // Вычисляем площадь квадрата
    Square s = new Square(5.0);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    // Вычисляем площадь прямоугольника со сторонами a, b
    Rectangle r = new Rectangle(2.0, 3.0);

    System.out.println("Площадь прямоугольника со сторонами: " + r.a + ", " + r.b + " = " + r.area());

  }

}