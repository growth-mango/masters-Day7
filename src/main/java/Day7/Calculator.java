package Day7;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private Stack stack;
    private Register register;

    public Calculator(Stack stack, Register register) {
        this.stack = stack;
        this.register = register;
    }

    public void calculateCommand(List<String> commands) {
        for (String command : commands) {
            switch (command) {
                case "POPA":
                    popA();
                    break;
                case "POPB" :
                    popB();
                    break;
            }
        }
    }

    private void popA() {
        try {
            Integer valueA = stack.popValue();
            register.setA(valueA);
        } catch (IllegalStateException e) {
            System.out.println("EMPTY");
        }
    }

    private void popB() {
        try {
            Integer valueB = stack.popValue();
            register.setB(valueB);
        } catch (IllegalStateException e) {
            System.out.println("EMPTY");
        }
    }

    private void add() {
        Integer a = register.getA();
        Integer b = register.getB();
        if (a == null || b == null) {
            System.out.println("ERROR");
        } else {
            stack.pushValue(a + b);
        }
    }


}
