package Day7;

public class Calculator {
    private Register register;
    private Stack stack;

    public Calculator(Register register, Stack stack) {
        this.register = register;
        this.stack = stack;
    }

    private void popA() {
        try {
            Integer valueA = stack.popValue();
            register.setA(valueA);
        } catch (IllegalStateException e) {
            System.out.println("EMPTY");
        }
    }

    private void popB(){
        try {
            Integer valueB = stack.popValue();
            register.setB(valueB);
        }catch (IllegalStateException e){
            System.out.println("EMPTY");
        }
    }

    private void add(){
        Integer a = register.getA();
        Integer b = register.getB();
        if(a == null || b == null){
            System.out.println("ERROR");
        }else {
            stack.pushValue(a+b);
        }
    }


}
