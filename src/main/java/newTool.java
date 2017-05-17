import java.util.Scanner;

public class newTool {


    public static void main(String[] args){
    }

    public  float centimetersToInches(float centimeters){
        if (centimeters<0){
            return 0;
        }
        float inches = (float) (((centimeters / 2.54) * 100 ) / 100.0);
        return (inches );
    }

    public static float InchesToCentimeters(float inches){
        if (inches<0){
            return 0;
        }
        float centimeters = (float) (((inches * 2.54) * 100 )/ 100.0 );
        return (centimeters );
    }

    public static float FeetToMeters(float feet) {
        if (feet<0){
            return 0;
        }
        float meters = (float) (((feet * 0.3048) * 100) / 100.0);
        return (meters);

    }


    public static float MetersToFeet(float meters){
        if (meters<0){
            return 0;
        }
        float feet = (float) (((meters / 0.3048) * 100) / 100.0);
        return (feet);
    }



    public static float CelsiusToFahrenheit(float celsius){
        float Fahrenheit = (float) ((((celsius * 9/5.0) +32) * 100) / 100.0);
        return (Fahrenheit);

    }


    public static float FahrenheitToCelsius(float fahrenheit){
        float celsius = (float) ((((fahrenheit -32) * 5/9.0) * 100) / 100.0);
        return (celsius);

    }

    public static float MphToKph(float mph){
        if (mph<0){
            return 0;
        }
        float Kph = (float) (((mph * 1.60934) * 100) / 100.0);
        return (Kph);

    }

    public static float KphToMph(float kph){
        if (kph<0){
            return 0;
        }
        float mph = (float) (((kph / 1.60934) * 100) / 100.0);
        return (mph);
    }


}


