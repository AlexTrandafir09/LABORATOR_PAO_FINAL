package Lab2.ex7;
import java.util.ArrayList;
import java.util.List;
public abstract class InputConverter {
    public static List<CalculatorRequest> mapRequests(String[] args){
        List<CalculatorRequest> requests = new ArrayList<>();

        for (int i = 0; i < args.length; i += 3) {
            Object leftOperand = args[i];
            String operation = args[i + 1];
            Object rightOperand = args[i + 2];
            requests.add(new CalculatorRequest(leftOperand, rightOperand, operation));
        }
        return requests;

    }
}
