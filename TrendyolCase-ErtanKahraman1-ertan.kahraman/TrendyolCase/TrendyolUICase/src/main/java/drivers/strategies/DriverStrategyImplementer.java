package drivers.strategies;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case "drivers.strategies.Chrome":
                return new Chrome();

            case "drivers.strategies.Firefox":
                return new Firefox();

            default:
                return null;
        }
    }
}
