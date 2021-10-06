public class Context {
    Operation work;

    public float UseAdd(float NumA,float NumB){
        work = new OperationAdd();
        work.setNumberA(NumA);
        work.setNumberB(NumB);
        return work.getResult();
    }

    public float UseSub(float NumA,float NumB){
        work = new OperationSub();
        work.setNumberA(NumA);
        work.setNumberB(NumB);
        return work.getResult();
    }

    public float UseMul(float NumA,float NumB){
        work = new OperationMul();
        work.setNumberA(NumA);
        work.setNumberB(NumB);
        return work.getResult();
    }

    public float UseDiv(float NumA,float NumB){
        work = new OperationDiv();
        work.setNumberA(NumA);
        work.setNumberB(NumB);
        return work.getResult();
    }
}
