package domain;

public class Rekening {
	
	private long rekeningnummer;
	private double saldo;
	private String houder;
	
	public long getRekeningnummer() {
		return rekeningnummer;}
	
	public double getSaldo() {
		return saldo;}
	
	public String getHouder() {
		return houder;}
	
	private void setRekeningnummer(long rekeningnummer) {
		this.rekeningnummer=rekeningnummer;}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;}
	
	private void setHouder(String houder) {
		this.houder=houder;}
	
	public Rekening() {
		setRekeningnummer(0);
		setSaldo(0);
		setHouder("Default");}
	
	public Rekening(long rekeningnummer) {
		setRekeningnummer(rekeningnummer);
		setSaldo(0);
		setHouder("Default");}
	
	public Rekening(long rekeningnummer, String houder) {
		setRekeningnummer(rekeningnummer);
		setSaldo(0);
		setHouder(houder);}
	
	public boolean stortOp(double bedrag) {
		if (bedrag >0) {
			this.saldo= this.saldo+bedrag;
			return true;}
		else return false;}
	
	public boolean haalAf(double bedrag) {
		if (bedrag >0 & (this.saldo-bedrag)>0) {
			this.saldo= this.saldo-bedrag;
			return true;}
		else return false;}
	
	public boolean schrijfBedragOverNaar (double bedrag, Rekening naarRek) {
		if (haalAf(bedrag)) 
			 if (naarRek.stortOp(bedrag)) 
				 return true;
			     else {stortOp(bedrag);
			     return false;}
		else return false;}
		
		
	
	}
	


