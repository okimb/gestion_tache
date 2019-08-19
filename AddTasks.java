package Constructor_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Tasks;

public class AddTasks {

	ArrayList<Tasks>TasksList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	//ADDING TASKS
	public void AddTask() {
		System.out.println("----WELCOME TO THE SECTION OF ADDING TASKS----");
		System.out.println("*****START INSERTING TASKS INFORMATIONS*******");
		System.out.println("                                              ");
		
		System.out.println("*****************Task's ID********************");
		int id_task=sc.nextInt();
		
		System.out.println("*****************Task's Name******************");
		String Name=sc.nextLine();
		
		System.out.println("************Task's Description****************");
		String description=sc.nextLine();
		
		System.out.println("***********Task's Start_Date******************");
		String Start=sc.nextLine();
		
		System.out.println("***********Task's End_Date********************");
		String End=sc.nextLine();
		
		System.out.println("***********Task's Status**********************");
		String status=sc.next();
		
		Tasks task=new Tasks(id_task, Name, description, Start, End, status);
		TasksList.add(task);
	
	}
	
	
}
