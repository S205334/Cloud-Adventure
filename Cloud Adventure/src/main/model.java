package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class model {
	
	private List<Project> projects;
	private List<Provider> providers;
	private List<String> services;
	private List<String> country;
	
	public static void main(String[] args) {

		
		

	}
	
	public void readInput() {
		projects = new LinkedList<>();
		providers = new LinkedList<>();
		services = new LinkedList<>();
		
		try {
			
			FileReader fr = new FileReader("input.in.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			if((line = br.readLine()) != null) // [V] [S] [C] [P]  
				if((line = br.readLine()) != null) // [service 1] [service 2] ... [service S]  
					for(String s : line.split(" "))
						services.add(s);
			
			if((line = br.readLine()) != null) // [country 1] [country 2] … [country C]
				for(String s : line.split(" "))
					country.add(s);
			
			if((line = br.readLine()) != null) // [provider 1] [num. of regions R1] 
				providers.add(new Provider(line.split(" ")[0], Integer.valueOf(line.split(" ")[1])));
			
			if((line = br.readLine()) != null) // [region 1]
				
				
						
			
			
			while ((line = br.readLine()) != null) {
			// Aggiungo word alla struttura dati

			}
			
					
			br.close();
				
		} catch (IOException e) {
					
			System.out.println("Errore nella lettura del file");
		}
	}

}
