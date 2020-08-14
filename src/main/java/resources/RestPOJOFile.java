package resources;

public class RestPOJOFile {
	public String firstName;
	public String title;
	public String middleName;
	public String lastName;
	public String suffix;
	public String gender;
	public String maritalStatus;
	public String employmentStatus;
	public String birthDate;
	public String languagePref;

	public RestPOJOFile(String firstName, String title, String middleName, String lastName, String suffix,
			String gender, String maritalStatus, String employmentStatus, String birthDate, String languagePref) {
		this.firstName = firstName;
		this.title = title;
		this.middleName = middleName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.employmentStatus = employmentStatus;
		this.birthDate = birthDate;
		this.firstName = languagePref;

	}

}
