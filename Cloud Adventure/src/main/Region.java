package main;

import java.util.LinkedList;
import java.util.List;

public class Region {
	private String name;
	private Integer packageNumber;
	private Double packageCost;
	private List<Integer> servicePerPackage;
	private List<Integer> regionCountryLatency;
	
	public Region(String name, Integer packageNumber, Double packageCost, List<Integer> servicePerPackage,
			List<Integer> regionCountryLatency) {
		super();
		this.name = name;
		this.packageNumber = packageNumber;
		this.packageCost = packageCost;
		this.servicePerPackage = new LinkedList<>();
		this.regionCountryLatency = new LinkedList<>();
	}
	
	
	
	

}
