class Cylinder {
    public double radius;
    public double height;
/*

 public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

*/
   

    


public double lidArea() {
    return Math.PI * radius * radius;
}

public double surfaceArea() {
    return 2 * Math.PI * radius * (radius + height);
}

public double volume() {
    return Math.PI * radius * radius * height;
}
}



public class CylinderTest {
    
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        // c.setRadius(5);
        // c.setHeight(10);
        c.radius=5;
        c.height=10;

        System.out.println("Lid Area: " +c.lidArea());

        System.out.printf("Lid Area: %.2f" ,c.lidArea());
        System.out.println();
        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println();
        System.out.println("Volume: " + c.volume());


    }
}
