package Lab2.ex7;

abstract class CalculatorResult {
    private CalculatorRequest calcRequest;
    public CalculatorRequest getRequest() {
        return calcRequest;
    }
    public abstract  Object computeResult();
    protected CalculatorResult(CalculatorRequest calculatorRequest) {
        this.calcRequest = calculatorRequest;
    }
}

class IntegerCalculatorResult extends CalculatorResult {
    protected IntegerCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Integer computeResult() {
        Integer op1 = Integer.parseInt(getRequest().getLeftOperand().toString());
        Integer op2 = Integer.parseInt(getRequest().getRightOperand().toString());
        String operation = getRequest().getOperation();

        if(operation.equals("+")) {
            return op1 + op2;
        }
        else if(operation.equals("-")) {
            return op1 - op2;
        }
        else if(operation.equals("*")) {
            return op1 * op2;
        }
        else if(operation.equals("/")) {
            return op1 / op2;
        }
        else {
            return null;
        }
    }
}

class DoubleCalculatorResult extends CalculatorResult {
    protected DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Double computeResult() {
        Double op1 = Double.parseDouble(getRequest().getLeftOperand().toString());
        Double op2 = Double.parseDouble(getRequest().getRightOperand().toString());
        String operation = getRequest().getOperation();

        if (operation.equals("+")) {
            return op1 + op2;
        } else if (operation.equals("-")) {
            return op1 - op2;
        } else if (operation.equals("*")) {
            return op1 * op2;
        } else if (operation.equals("/")) {
            return op1 / op2;
        } else {
            return null;
        }
    }
}

class BooleanCalculatorResult extends CalculatorResult {
    protected BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Boolean computeResult() {
        Boolean op1 = Boolean.parseBoolean(getRequest().getLeftOperand().toString());
        Boolean op2 = Boolean.parseBoolean(getRequest().getRightOperand().toString());
        String operation = getRequest().getOperation();

        if (operation.equals("&&")) {
            return op1 && op2;
        } else if (operation.equals("||")) {
            return op1 || op2;
        } else {
            return null;
        }
    }
}