public class Cylinder extends Circle {
    private double height;
    private double width;

    public Cylinder() {
    }

    public Cylinder(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Cylinder(double radius, String color, double height, double width) {
        super(radius, color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Diện tích hình trụ là" +
                getArea() +
                "\t" + "Thể tích hình trụ là:" +
                getVolume();
    }
}
