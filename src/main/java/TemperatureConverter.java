
public class TemperatureConverter {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println(converter.fahrenheitToCelsius(32));
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
}
