import java.util.Scanner;

class Point {
    double x, y;

    // Constructor to initialize the point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the distance from the origin
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

public class DistanceFromOrigin {
    
    // Method to find the point with the highest distance from the origin
    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3) {
        Point maxPoint = p1; // Assume p1 has the highest distance initially
        double maxDistance = p1.distanceFromOrigin(); // Get the distance of p1 from origin

        // Check if p2 has a higher distance
        if (p2.distanceFromOrigin() > maxDistance) {
            maxPoint = p2;
            maxDistance = p2.distanceFromOrigin();
        }

        // Check if p3 has a higher distance
        if (p3.distanceFromOrigin() > maxDistance) {
            maxPoint = p3;
        }

        return maxPoint;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading values for three point objects from the user
        System.out.println("Enter the x and y coordinates for point 1:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        Point p1 = new Point(x1, y1);

        System.out.println("Enter the x and y coordinates for point 2:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point p2 = new Point(x2, y2);

        System.out.println("Enter the x and y coordinates for point 3:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        Point p3 = new Point(x3, y3);

        // Finding the point with the highest distance from the origin
        Point result = pointWithHighestOriginDistance(p1, p2, p3);

        // Printing the point with the highest distance
        System.out.println("Point with highest distance from origin: (" + result.x + ", " + result.y + ")");
    }
}
