package pocetMez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
	
	
	File file = new File("lm.txt");
	String data;
	char s =' ';
	int i = 0;
	int j = 0;
	
	try {
		Scanner bob = new Scanner(file);
			System.out.println("soubor byl nalezen!"+"\n");

		while(bob.hasNextLine()) {
	data = bob.nextLine();
		System.out.println(data);
		
		for(char a:data.toCharArray())		{
			if(a==s) {
				i++;
	}
			
	}
		
	}
		try(Scanner bob1 = new Scanner(new FileInputStream(file))){
			while(bob1.hasNext()){
				bob1.next();
					j++;
	}
			
	}
	
	} catch (FileNotFoundException a) {
	      System.out.println("soubor nebyl nalezen!");
	      a.printStackTrace();
	}
	
	System.out.println("\n" + "poèet mezer v souboru : " + i);
	
	System.out.println("\n" + "poèet slov v souboru : " + j);
	}
	
	}