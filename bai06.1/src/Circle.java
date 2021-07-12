public class Circle {
    private double radius;
    private String color;

    public Circle (){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public	double	getArea(){
        return	Math.PI	*	this.radius	*	this.radius;
    }
    public	double	getPerimeter(){
        return	Math.PI	*	2	*	this.radius;
    }

    @Override
    public String toString() {
        return "Các thuộc tính của Circle là:" +
                getRadius()
                + "And" +
                getColor() + '\'' ;
    }
}
