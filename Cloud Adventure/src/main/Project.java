package main;

import java.util.LinkedList;
import java.util.List;

public class Project {
	private String country;
	private List unitsPerService;
	private Integer SLA; /*penalty, i.e. a fee to pay if our solution doesn't get the minimum
	amount of resources needed*/
	
	public Project(String country, List<Integer> unitsPerService, Integer SLA) {
		super();
		this.country = country;
		this.unitsPerService = new LinkedList<>(unitsPerService);
		this.SLA = SLA;
	}
	
	

}
