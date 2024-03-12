package Lab2.ex7;
import java.util.List;
import java.util.ArrayList;

public class SmarterCalculator {
    public static List<CalculatorResult> calculate(String[] args){
        List<CalculatorRequest> requests = InputConverter.mapRequests(args);
        List<CalculatorResult> res = new ArrayList<>();

        for (CalculatorRequest request : requests) {
            switch (request.getRequestType()) {
                case "Integer":
                    res.add(new IntegerCalculatorResult(request));
                    break;
                case "Double":
                    res.add(new DoubleCalculatorResult(request));
                    break;
                case "Boolean":
                    res.add(new BooleanCalculatorResult(request));
                    break;
                default:
                    break;
            }
        }
        return res;
    }
}
