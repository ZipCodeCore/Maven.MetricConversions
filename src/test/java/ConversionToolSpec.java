import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConversionToolSpec {

    newTool newTool = new newTool();

    @Test
    public void shouldConvertCentimetersToInches() {

        float inches = newTool.centimetersToInches(2f);
        assertEquals(0.7874f, inches, 0.001);
    }
    @Test
    public void shouldConvertZeroCentimetersToZeroInches() {
        float inches = newTool.centimetersToInches(0);
        assertEquals(0, inches, 0.0);
    }
    @Test
    public void shouldConvertNegativeCentimetersToZeroInches() {
        float inches = newTool.centimetersToInches(-5);
        assertEquals(0, inches, 0.0);
    }

    @Test
    public void shouldConvertInchesToCentimeters() {
        float centimeters = newTool.InchesToCentimeters(4f);
        assertEquals(10.16f, centimeters, 0.001);
    }
    @Test
    public void shouldConvertZeroInchesToZeroCentimeters() {
        float centimeters = newTool.InchesToCentimeters(0);
        assertEquals(0, centimeters, 0.0);
    }
    @Test
    public void shouldConvertNegativeInchesToZeroCentimeters() {
        float centimeters = newTool.InchesToCentimeters(-5);
        assertEquals(0, centimeters, 0.0);
    }

    @Test
    public void shouldConvertFeetToMeters() {
        float meters = newTool.FeetToMeters(5f);
        assertEquals(1.524f, meters, 0.001);
    }
    @Test
    public void shouldConvertZeroFeetToZeroMeters() {
        float meters = newTool.FeetToMeters(0);
        assertEquals(0, meters, 0.0);
    }
    @Test
    public void shouldConvertNegativeFeetToZeroMeters() {
        float meters = newTool.FeetToMeters(-10);
        assertEquals(0, meters, 0.0);
    }

    @Test
    public void shouldConvertMetersToFeet() {
        float feet = newTool.MetersToFeet(9f);
        assertEquals(29.5276f, feet, 0.001);
    }
    @Test
    public void shouldConvertZeroMetersToZeroFeet() {
        float feet = newTool.MetersToFeet(0);
        assertEquals(0, feet, 0.0);
    }
    @Test
    public void shouldConvertNegativeMetersToZeroFeet() {
        float feet = newTool.MetersToFeet(-10);
        assertEquals(0, feet, 0.0);
    }

        @Test
        public void shouldConvertFahrenheitToCelsius() {
            float celsius = newTool.FahrenheitToCelsius(80);
            assertEquals(26.67, celsius, 0.01);
        }

    @Test
    public void shouldConvertCelsiusToFahrenheit() {
        float fahrenheit = newTool.CelsiusToFahrenheit(26.67f);
        assertEquals(80, fahrenheit, 0.01);
    }

    @Test
    public void shouldConvertMphToKph(){
        float kph = newTool.MphToKph(24f);
        assertEquals(38.62, kph, 0.01);
    }
    @Test
    public void shouldConvertZeroMphToZeroKph(){
        float kph = newTool.MphToKph(0f);
        assertEquals(0, kph, 0.0);
    }
    @Test
    public void shouldConvertNegativeMphToZeroKph(){
        float kph = newTool.MphToKph(-50f);
        assertEquals(0, kph, 0.0);
    }

    @Test
    public void shouldConvertKphToMph(){
        float mph = newTool.KphToMph(6.44f);
        assertEquals(4, mph, 0.01);
    }
    @Test
    public void shouldConvertZeroKphToZeroMph(){
        float mph = newTool.KphToMph(0f);
        assertEquals(0, mph, 0.0);
    }
    @Test
    public void shouldConvertNegativeKphToZeroMph(){
        float mph = newTool.KphToMph(-50f);
        assertEquals(0, mph, 0.0);
    }

}
