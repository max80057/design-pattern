public class OperationDiv extends Operation{
    public void OperationDiv(){

    }

    @Override
    public float getResult() {
        float num = 0;
        if(getNumberB() <= 0){
            num =0;
            errorMsg = "除數為0，請輸入別組數字";
        }else {
            num = getNumberA() / getNumberB();
        }
        return num;
    }
}
