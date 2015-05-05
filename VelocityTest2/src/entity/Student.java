package entity;

public class Student {
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(){}
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String old(Integer num){
		if(num>90){
			return "长寿";
		}else{
			return null;
		}
	}
	

}
