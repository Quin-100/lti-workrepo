package com.lti.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.channels.NetworkChannel;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub      
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter Animal Type (Herbivores/Carnivores) : ");
			String a = br.readLine();
			AnimalFactory animFact = new AnimalFactory();
			Animal animal = animFact.createAnimal(a);
			System.out.println("Created the type");
			animal.eat();
			animal.sleep();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
