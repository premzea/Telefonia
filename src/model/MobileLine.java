package model;

public class MobileLine extends BasicPhoneLine implements CellularCaller{
    public final int MOBILE_PRICE_CALL = 10;
    private int minOfCellularCalls;
    
    public MobileLine(int minOfCellularCalls){
        super(0);
        this.minOfCellularCalls = minOfCellularCalls;
    }

    public void cellularCall(int i){

    }

    public int calculatePrice(int i){
        return i;
    }
}
