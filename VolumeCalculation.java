
public class VolumeCalculation {
    public static void main(String[] args) {
        // Diameters in miles
        double earthDiameter = 7600;      // Diameter of Earth in miles
        double sunDiameter = 865000;      // Diameter of Sun in miles

        // Calculate the radii (radius = diameter / 2)
        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;

        // Calculate the volume of Earth and Sun using the formula V = (4/3) * π * r^3
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Calculate the ratio of the volume of the Sun to the volume of the Earth
        double volumeRatio = sunVolume / earthVolume;

        // Output the results
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio + ".");
    }
}
