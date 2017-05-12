public class ConversionTool {


    public static void main(String[] args){}

    public static float CentimetersToInches(float centimeters){
            if(centimeters<0){
                return 0;
            }
        return (float)(centimeters/2.54);
    }

    public static float InchesToCentimeters(float inches){
        if(inches<0){
            return 0;
        }
        return (float)(inches*2.54);
    }

    public static float FeetToMeters(float feet){
        if(feet<0){
            return 0;
        }
        return (float)(feet/3.28084);
    }

    public static float MetersToFeet(float meters){
        if(meters<0){
            return 0;
        }
        return (float)(meters*3.28084);
    }

    public static float CelsiusToFahrenheit(float celsius){

        return (float)(celsius*1.8+32);
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return (float)((fahrenheit-32)/1.8);
    }

    public static float MphToKph(float mph){
        if(mph<0){
            return 0;
        }
        return (float)(mph*1.609344);
    }

    public static float KphToMph(float kph){
        if(kph<0){
            return 0;
        }
        return (float)(kph/1.609344);
    }
}
