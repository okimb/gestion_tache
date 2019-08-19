package Constructor_Tasks;

import java.util.ArrayList;

import Entities.Tasks;

public class ShowAllTasks {

	ArrayList<Tasks>TasksList=new ArrayList<>();
	
	//Showing all the tasks
	public void ShowTasks() {
		for(int i=0; i<TasksList.size();i++) {
			System.out.println("******* LIST OF THE ALL TASKS ********");
			System.out.println("                                      ");
			System.out.println(TasksList.get(i).toString());
		}
	}
	
}
