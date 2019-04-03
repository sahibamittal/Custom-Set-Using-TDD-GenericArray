// Author : Sahiba_Mittal

package src;

class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	
	Student(int id, String name){
		
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public int getId() {
		
		return this.id;
	}

	@Override
	public int compareTo(Student arg0) {
		
		return this.getId()-arg0.getId();
	}
}