package Constructor_Tasks;

import java.util.ArrayList;

import Entities.Tasks;

public class Delete_Tasks {

	ArrayList<Tasks>TasksList=new ArrayList<>();
	
	//DELETING TASKS
	public void deleteTask(long id) {
		System.out.println("******* Warning: Do you really wanna delete this task *******");
		System.out.println("****** Insert the Id of Task to delete from the system ******");
		for(int i=0; i<TasksList.size(); i++) {
			if (TasksList.get(i).getId_Task()==id) {
				TasksList.remove(i);
			}else
			{
				System.out.println("**** This task does not match with the Id or not exist*****");
				break;
			}
		}
	}
}
