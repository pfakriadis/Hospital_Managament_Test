import java.util.ArrayList;

public class Patient {
	private int amka;
	private String lastname;
	private String firstname;
	private String address;
	private int telephone;
	private String email;
	private int age;
	private String gender;
	private String bloodType;
	private String info;
	private Connector connector;
	
	public Patient(int amka, String lastname, String firstname, String address,
			int telephone, String email, int age, String gender,
			String bloodType, String info) {
		//super();
		this.amka = amka;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
		this.info = info;
		
	}

	public int getAmka() {
		return amka;
	}

	public void setAmka(int amka) {
		this.amka = amka;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	public void newEntry(){
		//connector = new Connector();
		//PatientList.addPatient(this);
	}
	public void save(){
		connector = new Connector(this);
		PatientList.addPatient(this);
		this.connector.save();
	}
	public void delete(){
		this.connector.delete();
	}
	public ArrayList<Patient> getData(){
		ArrayList<Patient> patients = new ArrayList<Patient>(PatientList.getPatients());
		return patients;
	}
	public Patient search(int amka){
		return (this.connector.search());
	}

}
