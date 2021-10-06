public class EasyFactory {

    public Operation create (String type){
        Operation operation = null;
        if(type.equals("add")){
            operation = new OperationAdd();
        }else if(type.equals("sub")){
            operation = new OperationSub();
        }else if(type.equals("mul")){
            operation = new OperationMul();
        }else if(type.equals("div")){
            operation = new OperationDiv();
        }else{

        }
        return operation;
    }
}
