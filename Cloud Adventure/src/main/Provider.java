package main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Provider {
	private String name;
	private Integer regionNumber;
	private List<Region> regions;
	
	public Provider(String name, Integer regionNumber) {
		super();
		this.name = name;
		this.regionNumber = regionNumber;
		this.regions = new LinkedList<>();
	}
	
	public void addRegion(Region r) {
		regions.add(r);
	}

	
}
