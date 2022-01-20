package service;

public class Person {

	String First_name;
	String Last_name;
	String address;
	String phoneNum;
	String zip;
	String city;
	String state;
	String email;
	private String type;


	public Person() {
		super();
	}

	public Person(String F_name, String L_name, String Addr, String MobileNum, String ZipCode, String City,
			String State, String Mail) {
		First_name = F_name;
		Last_name = L_name;
		address = Addr;
		phoneNum = MobileNum;
		zip = ZipCode;
		city = City;
		state = State;
		email = Mail;
	}
	public Person(String F_name, String L_name, String Addr, String MobileNum, String ZipCode, String City,
				  String State, String Mail,String Type) {
		First_name = F_name;
		Last_name = L_name;
		address = Addr;
		phoneNum = MobileNum;
		zip = ZipCode;
		city = City;
		state = State;
		email = Mail;
		type = Type;
	}
	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person{" +
				"First_name='" + First_name + '\'' +
				", Last_name='" + Last_name + '\'' +
				", address='" + address + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				", zip='" + zip + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", email='" + email + '\'' +
				", type='" + type + '\'' +
				'}';
	}

	public void print() {
		System.out.println("\nFirst Name : " + First_name + "\nLast Name : " + Last_name + "\nAddress : " + address
				+ "\nEmial : " + email + "\nPhone No : " + phoneNum + "\nZip Code : " + zip + "\nCity : " + city
				+ "\nState : " + state);
		System.out.println("\n\n****************************************************************************");
	}

}
