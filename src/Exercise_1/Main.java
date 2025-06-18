package Exercise_1;

public class Main {
    public static void main(String[] args) {
        Rectangle perimeter = new Rectangle(10, 20);
        System.out.println(perimeter.getPerimeter());
        Rectangle aerea = new Rectangle(10, 20);
        System.out.println(aerea.getArea());

        perimeter.stampaRectangle();

        Rectangle perimeter2 = new Rectangle(15, 25);
        System.out.println(perimeter2.getPerimeter());
        Rectangle aerea2 = new Rectangle(15, 25);
        System.out.println(aerea2.getArea());

        perimeter.stampaTwoRectangle(perimeter, perimeter2);

    }
}
