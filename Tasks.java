package Entities;

public class Tasks {
private long Id_Task;
private String Name_Task;
private String Description_Task;
private String Start_Date;
private String End_Date;
private String Status_Task;


public Tasks() {
	super();
	// TODO Auto-generated constructor stub
}


public Tasks(long id_Task, String name_Task, String description_Task, String start_Date, String end_Date,
		String status_Task) {
	super();
	Id_Task = id_Task;
	Name_Task = name_Task;
	Description_Task = description_Task;
	Start_Date = start_Date;
	End_Date = end_Date;
	Status_Task = status_Task;
}


public long getId_Task() {
	return Id_Task;
}


public void setId_Task(long id_Task) {
	Id_Task = id_Task;
}


public String getName_Task() {
	return Name_Task;
}


public void setName_Task(String name_Task) {
	Name_Task = name_Task;
}


public String getDescription_Task() {
	return Description_Task;
}


public void setDescription_Task(String description_Task) {
	Description_Task = description_Task;
}


public String getStart_Date() {
	return Start_Date;
}


public void setStart_Date(String start_Date) {
	Start_Date = start_Date;
}


public String getEnd_Date() {
	return End_Date;
}


public void setEnd_Date(String end_Date) {
	End_Date = end_Date;
}


public String getStatus_Task() {
	return Status_Task;
}


public void setStatus_Task(String status_Task) {
	Status_Task = status_Task;
}

public String toString() {
	return "Tasks[ Id_Task="+ Id_Task +", Name_Task="+ Name_Task +","
			+ " Description_Task="+ Description_Task + ",Start_Date ="+ Start_Date +", "
					+ "End_Date="+ End_Date +", Status_Task="+ Status_Task +" ]";
}
}
