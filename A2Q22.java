import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class A2Q22 {
    private static final Map<String, String> countryCapitalMap = new HashMap<>();

    static {
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
    }

    public static String getCapital(String country) throws NoMatchFoundException {
        String capital = countryCapitalMap.get(country);
        if (capital == null) {
            throw new NoMatchFoundException("No capital found for the country: " + country);
        }
        return capital;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CapitalFinder <country>");
            return;
        }
        
        String country = args[0];
        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

