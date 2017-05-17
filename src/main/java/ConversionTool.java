public class ConversionTool {


    public static void main(String[] args){}

    public static float CentimetersToInches(float centimeters){

        if(centimeters <=0){
            return 0;
        }
        return centimeters/2.54f;
    }

    public static float InchesToCentimeters(float inches){
        if(inches<=0){
            return 0;
        }
        return inches*2.54f;
    }

    public static float FeetToMeters(float feet){
        if(feet<=0){
            return 0;
        }
        return feet*0.3048f;
    }

    public static float MetersToFeet(float meters){
        if(meters<=0){
            return 0;
        }
        return meters*3.28084f;
    }

    public static float CelsiusToFahrenheit(float celsius){
        return ((celsius*9)/5)+32;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit-32)*5)/9;
    }

    public static float MphToKph(float mph){
        if(mph<=0){
            return 0;
        }
        return mph*1.60934f;
    }

    public static float KphToMph(float kph){
        if(kph<=0){
            return 0;
        }
        return kph*0.621371f;
    }


}
