import java.util.Scanner;
//Just playing with something I had on my had the main goal in the future is to introduce a database with different objects and their sizes so the user will be type for example "coca cola" and get the amount of coca colas.
public class EarthPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double EARTH_DIAMETER_KM = 12742.0; // Earth's diameter in km
        // Input: Size of the objects in meters
        System.out.print("Enter the size of the objects (in meters): ");
        double objectSizeMeters = scanner.nextDouble();

        // Calculate the number of objects required to cross Earth's diameter
        double diameterMeters = EARTH_DIAMETER_KM * 1000; // Convert Earth's diameter to meters
        double objectsToCrossDiameter = diameterMeters / objectSizeMeters;

        // Output the result
        System.out.println("To cross the diameter of Earth, you would need approximately " + (int) Math.ceil(objectsToCrossDiameter) + " objects of size " + objectSizeMeters + " meters.");
    }
}
//in the future a will implement a database with the size of different objects.