public class ConversionTool {


    public static void main(String[] args){}

   /* public float inches = 0f;
    public float centimeters;
    public float feet;
    public float meters;
    public float celsius;
    public float fahrenheit;
    public float mph;
    public float kph;*/

    public static float CentimetersToInches(float centimeters){

        float inches = Math.max(0, centimeters) * (1f / 2.54f);

        return inches;

    }

    public static float InchesToCentimeters(float inches){

        float centimeters = Math.max(0, inches) * 2.54f;

        return centimeters;
    }

    public static float FeetToMeters(float feet){

        float meters = Math.max(0, feet) * 0.3048f;

        return meters;

    }

    public static float MetersToFeet(float meters){

        float feet = Math.max(0, meters) * 3.28084f;
        return feet;

    }

    public static float CelsiusToFahrenheit(float celsius){
        return 1;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return 1;
    }

    public static float MphToKph(float mph){
        return 1;
    }

    public static float KphToMph(float kph){
        return 1;
    }
}
