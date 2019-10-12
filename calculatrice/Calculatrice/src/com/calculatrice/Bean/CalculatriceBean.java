package com.calculatrice.Bean;

public class CalculatriceBean {
	


	private double resultat;
	private String logMessage;
	
	public CalculatriceBean() {}
	
	public void doAddition( String nb1 , String nb2 ) 
	{
		this.resultat=(double) Integer.parseInt( nb1) + Integer.parseInt( nb1);
		this.logMessage="Le resultat de "+nb1+" + "+nb2+" est : "+this.resultat;
	}
	
	public void doSub( String nb1 , String nb2 ) 
	{
		this.resultat=(double) Integer.parseInt( nb1) - Integer.parseInt( nb1);
		this.logMessage="Le resultat de "+nb1+" - "+nb2+" est : "+this.resultat;
	}
	
	public void doDivision( String nb1 , String nb2 ) 
	{
		if(Integer.parseInt(nb2)<=0) {
			this.logMessage= "Division par 0 non prise en compte";
		}else 
		{
			this.resultat=(double) Integer.parseInt( nb1) / Integer.parseInt( nb1);
			this.logMessage="Le resultat de "+nb1+" / "+nb2+" est : "+this.resultat;
		}
		
	}
	
	public void superComputer(String nombre1, String nombre2, String signe)  {
		if(!signe.isEmpty()) {
			
			if(signe.equalsIgnoreCase("+")) 
			{
				this.resultat=0;
				this.doAddition(nombre1, nombre2);
			}else if(signe.equalsIgnoreCase("-")) 
			{
				this.resultat=0;
				this.doSub(nombre1, nombre2);
			}else if(signe.equalsIgnoreCase("/")) {
				this.resultat=0;
				this.doDivision(nombre1, nombre2);
			}else {
				this.resultat=0;
				this.logMessage="Opérateur non pris en compte";
			}
			
		}
	}
	
	public double getResultat() {
		return resultat;
	}

	public void setResultat(double resultat) {
		this.resultat = resultat;
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}
	
	

}
