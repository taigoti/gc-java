package firstLesson;

public class Temperature {
    public static void main(String[] args) {
        double celciusTemperature = 30.4;
        double fahrenheitTemperature = (celciusTemperature * 1.8) + 32;

        System.out.printf("A temperatura de %f Celsius é equivalente a %f Fahrenheit\n",
                celciusTemperature, fahrenheitTemperature);

        int integerFahrenheit = (int) fahrenheitTemperature;
        System.out.printf("A temperatura em Fahrenheit inteira é: %d\n", integerFahrenheit);
    }
}