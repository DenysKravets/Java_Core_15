package ua.lviv.lgs;

import java.util.*;
import java.util.Map.Entry;

public class ZooClub 
{
	private Scanner scan = new Scanner(System.in);
	private HashMap<Person, List<Animal>> map = new HashMap<Person, List<Animal>>();

	public ZooClub() {
		super();
	}
	
	public void addMember()
	{
		System.out.println("Add new member to the club;"
				+ "\nName: ");
		String name = scan.next();
		
		System.out.println("\nAge: ");
		int age = scan.nextInt();
		
		map.put(new Person(name, age), new ArrayList());
	}
	
	public void addPetToMember()
	{
		System.out.println("Add new pet to a member;"
				+ "\nMember Name: ");
		String memberName = scan.next();
		
		System.out.println("\nMember Age: ");
		int age = scan.nextInt();
		
		System.out.println("\nPet name: ");
		String petName = scan.next();
		
		System.out.println("\nType: ");
		String type = scan.next();
		
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Person, List<Animal>> entry = iterator.next();
			
			if(entry.getKey().equals(new Person(memberName, age)))
			{
				entry.getValue().add(new Animal(type, petName));
			}
		}
	}
	
	public void removePetfromMember()
	{
		System.out.println("Remove pet from a member;"
				+ "\nMember Name: ");
		String memberName = scan.next();
		
		System.out.println("\nMember Age: ");
		int age = scan.nextInt();
		
		System.out.println("\nPet name: ");
		String petName = scan.next();
		
		System.out.println("\nType: ");
		String type = scan.next();
		
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Person, List<Animal>> entry = iterator.next();
			
			if(entry.getKey().equals(new Person(memberName, age)))
			{
				entry.getValue().remove(new Animal(type, petName));
			}
		}
	}
	
	public void removeMemberFromClub()
	{
		System.out.println("Remove member from the club;"
				+ "\nMember Name: ");
		String memberName = scan.next();
		
		System.out.println("\nMember Age: ");
		int age = scan.nextInt();

		map.remove(new Person(memberName, age));
	}
	
	public void removePetFromAllMembers()
	{
		System.out.println("Remove pet from all members;");
		
		System.out.println("\nPet name: ");
		String petName = scan.next();
		
		System.out.println("\nType: ");
		String type = scan.next();
		
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Person, List<Animal>> entry = iterator.next();
			
			entry.getValue().remove(new Animal(type, petName));
		}
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
