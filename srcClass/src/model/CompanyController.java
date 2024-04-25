package model;

public class CompanyController{
	
	private BasicPhoneLine[] lines;
	
	public CompanyController(){
		this.lines = new BasicPhoneLine[1000];
	}
	
	public int calculateTotalPayment(){
		return 0;
	}
	
	public String addBasicPhoneLine(int numberOfCalls, int minOfLocalCalls){
		String msg = "";
			for(int i = 0; i<lines.length; i++){
				if(lines[i] == null){
					lines[i] = new BasicPhoneLine(numberOfCalls, minOfLocalCalls);
					msg = "New phone line";
				}
			}
		return msg;
	}
}