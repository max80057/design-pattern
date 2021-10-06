public class OperationSub extends Operation{

    public void OperationSub(){

    }

    @Override
    public float getResult() {
        float num = 0;
        num = getNumberA() - getNumberB();

        return num;
    }
}
