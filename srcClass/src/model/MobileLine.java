package model;

	public class MobileLine extends BasicPhoneLine implements CellularCaller{
		public static final int MOBILE_PRICE_CALL = 10;
		private int minOfCellularCalls;

		public MobileLine(int minsCellular, int minLocal){
			super(minLocal);
			this.minOfCellularCalls = minOfCellularCalls;
		}

		public MobileLine(int minOfLocal){
			super(minOfLocal);
			this.minOfCellularCalls = minOfCellularCalls;
		}

		public void celularCall(int mntsCall){

		}
 
 		public int calculatePrice(int timeCall){
			return 0;
		}
	}
	
	