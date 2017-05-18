public class ConversionTool {


    public static void main(String[] args){}


    // cm to inch

    public static float CentimetersToInches(float centimeters){

        if (centimeters <= 0){ return 0; }

        return (float)(centimeters * 0.393701);
    }



    // inch to cm
    public static float InchesToCentimeters(float inches){

        if (inches <= 0){ return 0; }

        return (float)(inches * 2.54);
    }


    // feet to meters
    public static float FeetToMeters(float feet){

        if (feet <= 0){ return 0; }

        return (float)(feet * 0.3048);
    }


    // meter to feet
    public static float MetersToFeet(float meters){

        if (meters <= 0){ return 0; }

        return (float)(meters * 3.28084);
    }


    // cel to fah
    public static float CelsiusToFahrenheit(float celsius){

        return (float)(celsius * 1.8 + 32);

    }


    // fah to cel
    public static float FahrenheitToCelsius(float fahrenheit){


        return (float)((fahrenheit - 32) / 1.8);
    }


    // mph to kph
    public static float MphToKph(float mph){

        if (mph <= 0){ return 0; }

        return (float)(mph * 1.60934);
    }


    // kph to mph
    public static float KphToMph(float kph){

        if (kph <= 0){ return 0; }

        return (float)(kph * 0.621371);
    }

}
