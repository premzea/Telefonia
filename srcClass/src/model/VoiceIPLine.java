package model;

public class VoiceIPLine extends MobileLine implements LongDistanceCaller{
    public final int VOICEIP_CALL = 7;
    public final int VOICEIP_LONGDISTANCE_CALL = 80;
    private int minOfLongDistance;

    // public VoiceIPLine(int minOfLongDistance){
    //     super();
    //     this.minOfLongDistance = minOfLongDistance;
    // }

    public VoiceIPLine(int minOfLongDistance, int mobile, int local){
        super(mobile, local);
        this.minOfLongDistance = minOfLongDistance;
    }

    public void longDistanceCall(int i){
        
    }

    public int calculatePrice(){
        return 0;
    }
}
