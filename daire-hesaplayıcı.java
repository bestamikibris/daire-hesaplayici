import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
	
	int r, aci;
	double pi = 3.14;
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Dairenin yarıçapını giriniz: ");
	r = input.nextInt();
	
	double alan = pi*r*r;
	double cevre = 2* pi* r;
	
	System.out.println("Dairenin alanı: "+ alan);
	System.out.println("Dairenin çevresi: "+ cevre);
	
	System.out.print("Dairenin merkez açısını giriniz: ");
	aci = input.nextInt();
	
	double dairedilimi = (pi* (r*r)*aci)/360;
	
	System.out.println("Daire diliminin alanı: "+ dairedilimi);
	
	
	}
}
