package model;

public class MobileLine extends BasicPhoneLine implements CellularCaller{
    public final int MOBILE_PRICE_CALL = 10;
    private int minOfCellularCalls;
    private int minOfLocalCalls;
    
    public MobileLine(int minOfCellularCalls, int minOfLocalCalls){
        super(minOfLocalCalls);
        this.minOfCellularCalls = minOfCellularCalls;
    }

    public MobileLine(int minOfCellularCalls){
        super(minOfCellularCalls);
        //no creo  este bien con logica
        this.minOfCellularCalls = minOfCellularCalls;
    }

    public void cellularCall(int i){

    }

    public int calculatePrice(int i){
        return i;
    }
}
