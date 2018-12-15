package com.lti.practice;

public class AnimalFactory {
	 public Animal createAnimal(String type)
	 {
		 if (type.equalsIgnoreCase("Carnivores"))
		 {
			 return new Carnivores();
			 
		 }
		 
		 else
		 {
			 return new Herbivores();
			 
		 }
		 
	 }
	
	
	
	

}
