package model;

public class VoiceIPLine extends MobileLine implements LongDistanceCaller{
    public final int VOICEIP_CALL = 7;
    public final int VOICEIP_LONGDISTANCE_CALL = 80;
    private int minOfLongDistance;

    public VoiceIPLine(int minOfLongDistance){
        this.minOfLongDistance = minOfLongDistance;
    }

    public void longDistanceCall(int i){
        int values = i;
    }

    public int calculatePrice(){
        int value = 0;
        return value;
    }
}
