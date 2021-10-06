public abstract class Operation {
    float numberA = 0;
    float numberB = 0;
    float result = 0;
    String errorMsg = "";


    public void setNumberA(float originalNumber) {
        this.numberA = originalNumber;
    }

    public float getNumberA() {
        return numberA;
    }

    public void setNumberB(float payNumber) {
        this.numberB = payNumber;
    }

    public float getNumberB() {
        return numberB;
    }

    public float getResult(){
        return result;
    }

}