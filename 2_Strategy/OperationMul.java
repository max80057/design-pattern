public class OperationMul extends Operation{
    public void OperationMul(){

    }

    @Override
    public float getResult() {
        float num = 0;
        num = getNumberA() * getNumberB();

        return num;
    }
}
