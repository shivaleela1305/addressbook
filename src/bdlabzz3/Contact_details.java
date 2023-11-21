package bdlabzz3;

//initializing for adding the contact to address book
public class Contact_details {
	private String first_name;
	private String last_name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone_no;
    private String email_id;
    
    private String first_name1;
	private String last_name1;
    private String address1;
    private String city1;
    private String state1;
    private String zip1;
    private String phone_no1;
    private String email_id1;
    

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	

	@Override
	public String toString() {
		return "Contact_details [first_name=" + first_name + ", last_name=" + last_name + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone_no=" + phone_no + ", email_id="
				+ email_id + "]";
	}
	
	// getters and setters for editing the details
			public String getFirst_name1() {
				return first_name1;
			}

			public void setFirst_name1(String first_name1) {
				this.first_name1 = first_name1;
			}

			public String getLast_name1() {
				return last_name1;
			}

			public void setLast_name1(String last_name1) {
				this.last_name1 = last_name1;
			}

			public String getAddress1() {
				return address1;
			}

			public void setAddress1(String address1) {
				this.address1 = address1;
			}

			public String getCity1() {
				return city1;
			}

			public void setCity1(String city1) {
				this.city1 = city1;
			}

			public String getState1() {
				return state1;
			}

			public void setState1(String state1) {
				this.state1 = state1;
			}

			public String getZip1() {
				return zip1;
			}

			public void setZip1(String zip1) {
				this.zip1 = zip1;
			}

			public String getPhone_no1() {
				return phone_no1;
			}

			public void setPhone_no1(String phone_no1) {
				this.phone_no1 = phone_no1;
			}

			public String getEmail_id1() {
				return email_id1;
			}

			public void setEmail_id1(String email_id1) {
				this.email_id1 = email_id1;
			}
			
			public void toString1() {
				System.out.println("edited_Contact_details [first_name1=" + first_name1 + ", last_name1=" + last_name1 + ", address1=" + address1
						+ ", city1=" + city1 + ", state1=" + state1 + ", zip1=" + zip1 + ", phone_no1=" + phone_no1 + ", email_id1="
						+ email_id1 + "]");
			    }
	
}
