package Exercise_1;

public class Rectangle {
    private int height;
    private int length;

    public Rectangle(int heig, int leng) {
        this.height = heig;
        this.length = leng;

    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getPerimeter() {
        int perimeter = (this.height * 2) + (this.length * 2);
        return perimeter;

    }

    public int getArea() {
        int aerea = this.height * this.length;
        return aerea;
    }

    public void stampaRectangle() {
        System.out.println("Il perimetro del rettangolo è: " + getPerimeter() + " " + "L'area del rettangolo è: " + getArea());

    }

    public void stampaTwoRectangle(Rectangle rect1, Rectangle rect2) {
        System.out.println("Il perimetro del primo rettangolo è : " + rect1.getPerimeter());
        System.out.println("L'area del primo rettangolo è : " + rect1.getArea());
        System.out.println("Il perimetro del secondo rettangolo è : " + rect2.getPerimeter());
        System.out.println("Il area del secondo rettangolo è : " + rect2.getArea());
        int sumPerim = rect1.getPerimeter() + rect2.getPerimeter();
        int sumArea = rect2.getArea() + rect2.getArea();
        System.out.println("La somma dei perimetri sono : " + sumPerim);
        System.out.println("La somma delle area sono : " + sumArea);

    }


}