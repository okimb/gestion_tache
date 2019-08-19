package Constructor_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Tasks;

public class EditingTasks {

	ArrayList<Tasks>TasksList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	//EDITING TASKS
	public void EditTasks() {
		System.out.println("***** WELCOME TO THE SECTION OF EDITING TASKS *********");
		     System.out.println("***** INSERT THE ID OF TASK TO EDIT ********");
		     long Id=sc.nextLong();	
		     sc.nextLine();
		     for(int i=0; i<TasksList.size(); i++) {
		    	 if(TasksList.get(i).getId_Task()==Id) {
		    		 
		    		 System.out.println(" ********** INSERT THE NAME OF TASKS ************");
		    		 String Name=sc.nextLine();
		    		 TasksList.get(i).setName_Task(Name);
		    		 
		    		 System.out.println("*********** INSERT THE DESCRIPTION OF TASKS*******");
		    		 String Description=sc.nextLine();
		    		 TasksList.get(i).setDescription_Task(Description);
		    		 
		    		 System.out.println("************ INSERT START DATE OF TASK ***********");
		    		 String Start=sc.nextLine();
		    		 TasksList.get(i).setStart_Date(Start);
		    		 
		    		 System.out.println("*********** INSERT END DATE OF TASK **************");
		    		 String End=sc.nextLine();
		    		 TasksList.get(i).setEnd_Date(End);
		    		 
		    		 System.out.println("*********** INSERT THE STATUS OF TASK ************");
		    		 String status=sc.nextLine();
		    		 TasksList.get(i).setStatus_Task(status);
		   
		    	 }
		    	 else {
		    		 System.out.println("************ This Id does not match with any task to be edited********");
		    		 break;
		    	 }
		     }
	
	}
	
	
}
