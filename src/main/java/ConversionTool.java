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

        float fahrenheit = (celsius *(9f/5f)) + 32f;
        return fahrenheit;
    }

    public static float FahrenheitToCelsius(float fahrenheit){

        float celsius = (fahrenheit - 32f) * (5f/9f);
        return celsius;
    }

    public static float MphToKph(float mph){

        float kph = Math.max(0, mph) * 1.60934f;
        return kph;
    }

    public static float KphToMph(float kph){
        float mph = Math.max(0, kph) * 0.621371f;
        return mph;

    }
}
