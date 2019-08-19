package Constructor_Tasks;

import java.util.ArrayList;

import Entities.Tasks;

public class ShowOneTask {

	
	ArrayList<Tasks>TasksList=new ArrayList<>();
	 
	//Show a task
	public void ShowTask(long id) {
		for(int i=0; i<TasksList.size(); i++) {
			if(TasksList.get(i).getId_Task()==id) {
				System.out.println("***** Task Informations ******");
				System.out.println("                              ");
				System.out.println(TasksList.get(i).toString());
			}else {
				System.out.println("**** This task does not exist ******");
				break;
			}
		}
	}
}
