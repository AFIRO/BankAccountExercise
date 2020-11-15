package cui;
import domain.Rekening;
import java.util.Scanner;

public class RekeningOperaties {

	public static void main(String[] args) {
	int input;
	int nogEens;
	Scanner S = new Scanner(System.in);
	Rekening[] rekeningen = new Rekening[3];
	rekeningen[0]= new Rekening(123123456712L, "Sam");
	rekeningen[1]= new Rekening(123456789012L, "Arno");
	rekeningen[2]= new Rekening(101010101010L, "Stef");
	
	System.out.print("Geef nummer van de rekening (1-3): ");
	input = S.nextInt();
	int index = input;
    while (index <1 || index >3) {
    	System.out.print("Geef nummer van de rekening (1-3): ");
    	input = S.nextInt();
    	index=input;
    }
	index--;
    System.out.printf("Geef het bedrag: ");
    input = S.nextInt();
	int bedrag=input;
	stortOpEenRekening(index,bedrag,rekeningen);

	
	System.out.print("Wil je nog storten op een rekening (ja = 1): ");
	input = S.nextInt();
	nogEens = input;
	
	while (nogEens == 1) {
		System.out.print("Geef nummer van de rekening (1-3): ");
		input = S.nextInt();
		index = input;
	    while (index <1 || index >3) {
	    	System.out.print("Geef nummer van de rekening (1-3): ");
	    	input = S.nextInt();
	    	index=input;
	    }
		index--;
	    System.out.printf("Geef het bedrag: ");
	    input = S.nextInt();
		bedrag=input;
		stortOpEenRekening(index,bedrag,rekeningen);
		System.out.print("Wil je nog storten op een rekening (ja = 1): ");
		input = S.nextInt();
		nogEens = input;}
	
	toonRekeningen(rekeningen);
	
}
	
public static void stortOpEenRekening(int index, double bedrag, Rekening[] rekeningen) {
    
	rekeningen[index].stortOp(bedrag);}

private static void toonRekeningen(Rekening[] rekeningen) {
	 for (Rekening rekening: rekeningen) {
		 toon1Rekening(rekening);
		 System.out.println();}}

private static void toon1Rekening(Rekening rekening) {
	    System.out.printf("De rekening met rekeningnummer %d behoort toe aan %s en heeft als saldo €%.2f", rekening.getRekeningnummer(),rekening.getHouder(),rekening.getSaldo());
}
	
}

	

	

	
	

