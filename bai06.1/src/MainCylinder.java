public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.4,"Red",7.8,5.9);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
