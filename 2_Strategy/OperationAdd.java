public class OperationAdd extends Operation{

    public void OperationAdd(){

    }

        @Override
        public float getResult() {
            float num = 0;
            num = getNumberA() + getNumberB();

            return num;
        }
}
