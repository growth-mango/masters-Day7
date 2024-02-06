package Day7;

// 레지스터 A, B 처음에는 null
public class Register {
    private Integer a = null;
    private Integer b = null;

//    public Register() {
//        this.a = a;
//        this.b = b;
//    }

    public void setA(Integer value) {
        this.a = value;
    }

    public void setB(Integer value) {
        this.b = value;
    }

    public Integer getA() {
        return this.a;
    }

    public Integer getB() {
        return this.b;
    }

    public void swap() {
        Integer temp = this.a ;
        this.a = this.b;
        this.b = temp;
    }
}
