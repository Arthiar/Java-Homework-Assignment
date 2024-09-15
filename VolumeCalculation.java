       public class VolumeCalculation {
        public static void main(String[] args) {
        double earthDiameter = 7600;      
        double sunDiameter = 865000;      
        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
        double volumeRatio = sunVolume / earthVolume;
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println(
"The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio + ".");}}
