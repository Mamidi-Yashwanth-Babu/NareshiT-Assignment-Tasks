package streamAPI;

public class Employee {
	private String EmpName;
	private int EmoId;
	public String getEmpName() {
		return EmpName;
	}
	
	public Employee(String empName, int emoId) {
		super();
		EmpName = empName;
		EmoId = emoId;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmoId() {
		return EmoId;
	}
	public void setEmoId(int emoId) {
		EmoId = emoId;
	}
	
}
