public class ConversionTool {


    public static void main(String[] args){}

    public static float CentimetersToInches(float centimeters){

        if(centimeters <0){
            return 0;
        }
        return centimeters/2.54f;
    }

    public static float InchesToCentimeters(float inches){
        if(inches <0){
            return 0;
        }
        return inches*2.54f;
    }

    public static float FeetToMeters(float feet){
        if(feet < 0){
            return 0;
        }
        return feet* 0.3048f;
    }

    public static float MetersToFeet(float meters){
        if(meters < 0){
            return 0;
        }
        return meters/0.3048f;
    }

    public static float CelsiusToFahrenheit(float celsius){
        return (celsius*1.8f)+32;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return (fahrenheit-32)*.5556f;

    }

    public static float MphToKph(float mph){
        if(mph < 0){
            return 0;
        }
        return mph*1.609344f;
    }

    public static float KphToMph(float kph){
        if(kph < 0){
            return 0;
        }
        return kph/1.609344f;
    }
}
