public class ConversionTool {


    public static void main(String[] args){}

    public static float CentimetersToInches(float centimeters){
        if(centimeters <= 0) return 0;
        else return centimeters / 2.54f;
    }

    public static float InchesToCentimeters(float inches){
        if(inches <= 0) return 0;
        else return inches * 2.54f;
    }

    public static float FeetToMeters(float feet){
        if (feet <= 0) return 0;
        else return feet * 0.3048f;
    }

    public static float MetersToFeet(float meters){
        if(meters <= 0) return 0;
        else return meters / 0.3048f;
    }

    public static float CelsiusToFahrenheit(float celsius){
        return (celsius * 9 / 5) + 32f;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32f) * 5f / 9f;
    }

    public static float MphToKph(float mph){
        if(mph <= 0) return 0;
        else return mph * 1.609344f;
    }

    public static float KphToMph(float kph){
        if (kph <= 0) return 0;
        else return kph / 1.609344f;
    }
}
