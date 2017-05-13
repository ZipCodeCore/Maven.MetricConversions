

public class ConversionTool {


    public static void main(String[] args) {
    }

    public static float CentimetersToInches(float centimeters) {
        double inches_per_cm = 0.393701;
        if (centimeters < 0) {
            return 0;
        } else {
            return (float) (centimeters * inches_per_cm);
        }
    }

    public static float InchesToCentimeters(float inches) {
        double cm_per_inch = 2.54;
        if (inches < 0) {
            return 0;
        } else {
            return (float) (inches * cm_per_inch);
        }
    }

    public static float FeetToMeters(float feet) {
        double Meters_Per_Foot = 0.3048;
        if (feet < 0) {
            return 0;
        } else {

            return (float) (feet * Meters_Per_Foot);
        }
    }

    public static float MetersToFeet(float meters) {
        double Feet_Per_Meter = 3.28084;
        if (meters < 0) {
            return 0;
        } else {
            return (float) (meters * Feet_Per_Meter);
        }
    }

    public static float CelsiusToFahrenheit(float celsius) {
       return (float) ((celsius * 9/5) + 32);
    }

    public static float FahrenheitToCelsius(float fahrenheit) {
        double fahren_to_cels = (- 32) * 5/9;
        return (float) ((fahrenheit - 32) * 5/9);
    }

    public static float MphToKph(float mph) {
        double KPH_PER_MPH = 1 / 0.621371;
        if (mph < 0) {
            return 0;
        } else {
            return (float) (KPH_PER_MPH * mph);
        }
    }

    public static float KphToMph(float kph) {
        double MPH_PER_KPH = 0.621371;
        if (kph < 0) {
            return 0;
        } else {
            return (float) (kph * MPH_PER_KPH);
        }
    }
}
