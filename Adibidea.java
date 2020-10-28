package Eb1;
import java.util.Scanner;

public class Adibidea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teklatua=new Scanner(System.in);
		int hilabetea=0;
		
		//Hilabetea eskatu
		System.out.println("Ongi etorri gure aplikazioetara!");
		System.out.println("Sartu hilabete baten zenbakia");
		
		//Hilabetea jaso
		hilabetea=teklatua.nextInt();
		
		//Hilabetearen zenbakiaren arabera hilabetearen izena eman
		switch (hilabetea) {
			case 1:
				System.out.println("Urtarrila");
				break;
			case 2:
				System.out.println("Otsaila");
				break;
			case 3:
				System.out.println("Martxoa");
				break;
			case 4:
				System.out.println("Apirila");
				break;
			case 5:
				System.out.println("Maiatza");
				break;
			case 6:
				System.out.println("Ekainak");
				break;
			case 7:
				System.out.println("Uztaila");
				break;
			case 8:
				System.out.println("Abuztua");
				break;
			case 9:
				System.out.println("Iraila");
				break;
			case 10:
				System.out.println("Urria");
				break;
			case 11:
				System.out.println("Azaroa");
				break;
			case 12:
				System.out.println("Abendua");
				break;
				
			default:
				System.out.println("Hori ez da hilabete baten zenbakia");
				break;
		}

	}

}
