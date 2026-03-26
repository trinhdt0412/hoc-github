package bai1.code;

public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
    public abstract void erase();

    public void moveTo(int newX, int newY) {
        erase();
        this.x = newX;
        this.y = newY;
        draw();
    }
}

class Circle extends Shape {
    public Circle(int x, int y) {
        super(x,y);
    }
    
    @Override
    public void draw() {
        System.out.println("Ve hinh tron tai " + "(" + this.x + ", " + this.y +")");
    }

    @Override
    public void erase() {
        System.out.println("Xoa hinh tron tai " + "(" + this.x + ", " + this.y +")");
    }
}

class Square extends Shape {

    public Square(int x, int y) {
        super(x,y);
    }
    
    @Override
    public void draw() {
        System.out.println("Ve hinh vuong tai " + "(" + this.x + ", " + this.y +")");
    }

    @Override
    public void erase() {
        System.out.println("Xoa hinh vuong " + "(" + this.x + ", " + this.y +")");
    }
}