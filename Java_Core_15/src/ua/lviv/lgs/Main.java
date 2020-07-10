package ua.lviv.lgs;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
		ZooClub club = new ZooClub();
		
		
		Scanner scan = new Scanner(System.in);
		
		int decision;
		
		while(true)
		{
			System.out.println("Menu"
					+ "\n1 - add member"
					+ "\n2 - pet"
					+ "\n3 - remove pet"
					+ "\n4 - remove member"
					+ "\n5 - remove pet from everyone"
					+ "\n6 - print"
					+ "\n0 - exit");
			
			decision = scan.nextInt();
			
			switch(decision)
			{
			case 1:
			{
				club.addMember();
				break;
			}
			case 2:
			{
				club.addPetToMember();
				break;
			}
			case 3:
			{
				club.removePetfromMember();
				break;
			}
			case 4:
			{
				club.removeMemberFromClub();
				break;
			}
			case 5:
			{
				club.removePetFromAllMembers();
				break;
			}
			case 6:
			{
				System.out.println(club);
				break;
			}
			case 0:
			{
				System.exit(0);
				break;
			}
			}
		}
	}

}
