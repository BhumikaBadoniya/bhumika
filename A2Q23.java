class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}
public class A2Q23{
    public static void checkTemperature(int temperature) throws TooHotException, TooColdException {
        if (temperature > 35) {
            throw new TooHotException("Temperature is too hot!");
        } else if (temperature < 5) {
            throw new TooColdException("Temperature is too cold!");
        } else {
            System.out.println("Temperature is just right.");
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TemperatureCheck <temperature>");
            return;
        }

        try {
            int temperature = Integer.parseInt(args[0]);
            checkTemperature(temperature);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer for the temperature.");
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}

