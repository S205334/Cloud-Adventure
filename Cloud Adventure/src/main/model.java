package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class model {
	
	private static List<Project> projects;
	private static List<Provider> providers;
	private static List<String> services;
	private static List<String> country;
	
	public static void main(String[] args) {

		readInput();
		
		System.out.println();
	}
	
	public static void readInput() {
		projects = new LinkedList<>();
		providers = new LinkedList<>();
		services = new LinkedList<>();
		country = new LinkedList<>();
		
		try {
			
			FileReader fr = new FileReader("src/first_adventure.in");
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			if((line = br.readLine()) != null) // [V] [S] [C] [P]  
				if((line = br.readLine()) != null) // [service 1] [service 2] ... [service S]  
					for(String s : line.split(" "))
						services.add(s);
			
			if((line = br.readLine()) != null) // [country 1] [country 2] … [country C]
				for(String s : line.split(" "))
					country.add(s);
			
			line = br.readLine();
			
			while (line != null) {
				
				Provider p;

				if(line.split(" ").length == 2) { // [provider 1] [num. of regions R1]
					p = new Provider(line.split(" ")[0], Integer.valueOf(line.split(" ")[1]));
					providers.add(p);
				} else 
					break;
				
				line = br.readLine();
				
				while (line.split(" ").length == 1 ) {
				
					String nameRegion = line; // [region 1]
					line = br.readLine(); // [available packages] [package unit cost] [units of service per package 1] ... 0 ... [units of service per package S] 
					int availablePackages = Integer.valueOf(line.split(" ")[0]);
					double cost = Double.valueOf(line.split(" ")[1]);
					List<Integer> unitsPerService = new LinkedList<Integer>();
					
					for(int i = 2; i<services.size()+2; i++)
						unitsPerService.add(Integer.valueOf(line.split(" ")[i]));
					
					List<Integer> latency = new LinkedList<>();
					line = br.readLine(); // [latency 1] [latency 2] … [latency C] 
					
					for(String s : line.split(" ")) 
						latency.add(Integer.valueOf(s));
					
					p.addRegion(new Region(nameRegion, availablePackages, cost, unitsPerService, latency));
					
					line = br.readLine();
				}

			}
			
			while(line != null) {
				
				List<Integer> unitsPerService = new LinkedList<Integer>();
				for(int i = 2; i<services.size()+2; i++)
					unitsPerService.add(Integer.valueOf(line.split(" ")[i]));
				
				projects.add(new Project(line.split(" ")[1], 
						unitsPerService,
						Integer.valueOf(line.split(" ")[0])));
				
				line = br.readLine();
			}
					
			br.close();
				
		} catch (IOException e) {
					
			System.out.println("Errore nella lettura del file");
		}
	}

}
