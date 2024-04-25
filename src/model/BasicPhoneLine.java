package model;

public class BasicPhoneLine implements LocalCaller{
    public final int PRICE_LOCAL_CALL = 35;
    private int numberOfCalls;
    private int minOfLocalCalls;

    public BasicPhoneLine(int minOfLocalCalls){
        this.minOfLocalCalls = minOfLocalCalls;
    }

    public BasicPhoneLine(int minOfLocalCalls, int numberOfCalls){
        this.minOfLocalCalls = minOfLocalCalls;
        this.numberOfCalls = numberOfCalls;
    }

    public void localCall(int i){

    }

    public int priceLocalCalls(){
        return 0;
    }
}