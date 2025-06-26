package encapsulation;

public class employee {
	 private String name;
	 private int age;
	    
	    public String getName() {
	        return name;
	    }
	    public void setName(String newName) {
	        name = newName;
	    }
	    public int getAge() {
	        return age;
	    }
	    public int setAge(int newAge) {
	        return age = newAge;
	    }
	public static void main(String[] args) {
		employee emp = new employee();
		emp.setName("manu");
		emp.setAge(22);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());

		
	}
	
}