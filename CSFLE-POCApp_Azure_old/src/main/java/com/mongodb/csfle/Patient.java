package com.mongodb.csfle;

public class Patient {
	
	private String title;
	private String f_name;
	private String l_name ; // get the value in the csv assign keywords
	private String dob;
	private String gender;
	private int ssn;
	private String race;
	private String email;
	private String language;
	private String city;
	private String state;
	private String country;
	private String phone;
	private String company;
	private String duns_number;
	private String drug_company;
	private String drug_brand;
	private String drug_name;
	private String fda_code;
	private String procedure_code;
	private String idc9_diagnosis_code;
	private String idc9_dx_code;
	private String idc10_diagnosis_code;
	private String idc10_dx_code;
	private String street_name;
	private String street_number;
	private String street_suffix;
	private String time_zone;
	private String provider_type;
	private String specialty_care;
	private String provider_firstname;
	private String provider_lastname;
	private String provider_company;
	private String patient_id;
	private String procedure;
	private String diagnosis;
	private String spouse;
	private String spouse_number;
	private Insurance Insurance;
	private Emergency Emergency;
	private MedicalRecords MedicalRecords;
	
	public Patient() {
		super();
			}
	
	
//	public Patient(String f_name, String l_name, String email, String gnder, int ssn, Insurance insurance,
//			String weight) {
//		super();
//		this.f_name = f_name;
//		this.l_name = l_name;
//		this.email = email;
//		this.gnder = gnder;
//		this.ssn = ssn;
//		this.insurance = insurance;
//		this.weight = weight;
//	}
	
	
	public Patient(String title, String f_name, String l_name, String dob, String gender, int ssn, String race,
			String email, String language, String city, String state, String country, String phone, String company,
			String duns_number, String drug_company, String drug_brand, String drug_name, String fda_code,
			String procedure_code, String idc9_diagnosis_code, String idc9_dx_code, String idc10_diagnosis_code,
			String idc10_dx_code, String street_name, String street_number, String street_suffix, String time_zone, String provider_type,
			String specialty_care, String provider_firstname, String provider_lastname, String provider_company,String patient_id, String procedure, String diagnosis, String spouse,
			String spouse_number, Insurance Insurance, com.mongodb.csfle.Patient.Emergency emergency,
			com.mongodb.csfle.Patient.MedicalRecords medicalRecords) {
		super();
		this.title = title;
		this.f_name = f_name;
		this.l_name = l_name;
		this.dob = dob;
		this.gender = gender;
		this.ssn = ssn;
		this.race = race;
		this.email = email;
		this.language = language;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
		this.company = company;
		this.duns_number = duns_number;
		this.drug_company = drug_company;
		this.drug_brand = drug_brand;
		this.drug_name = drug_name;
		this.fda_code = fda_code;
		this.procedure_code = procedure_code;
		this.idc9_diagnosis_code = idc9_diagnosis_code;
		this.idc9_dx_code = idc9_dx_code;
		this.idc10_diagnosis_code = idc10_diagnosis_code;
		this.idc10_dx_code = idc10_dx_code;
		this.street_name = street_name;
		this.street_number = street_number;
		this.street_suffix = street_suffix;
		this.time_zone = time_zone;
		this.provider_type = provider_type;
		this.specialty_care = specialty_care;
		this.provider_firstname = provider_firstname;
		this.provider_lastname = provider_lastname;
		this.provider_company = provider_company;
		this.patient_id = patient_id;
		this.procedure = procedure;
		this.diagnosis = diagnosis;
		this.spouse = spouse;
		this.spouse_number = spouse_number;
		this.Insurance = Insurance;
		this.Emergency = emergency;
		this.MedicalRecords = medicalRecords;
	}


//	@Override
//	public String toString() {
//		return "Patient [f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + ", gnder=" + gnder + ", ssn="
//				+ ssn + ", insurance=" + insurance.toString() + ", weight=" + weight + "]";
//	}

	

	public String getF_name() {
		return f_name;
	}
	
	public String setF_name() {
		return f_name;
	}
	
	
	@Override
	public String toString() {
		return "Patient [title=" + title + ", f_name=" + f_name + ", l_name=" + l_name + ", dob=" + dob + ", gender="
				+ gender + ", ssn=" + ssn + ", race=" + race + ", email=" + email + ", language=" + language + ", city="
				+ city + ", state=" + state + ", country=" + country + ", phone=" + phone + ", company=" + company
				+ ", duns_number=" + duns_number + ", drug_company=" + drug_company + ", drug_brand=" + drug_brand
				+ ", drug_name=" + drug_name + ", fda_code=" + fda_code + ", procedure_code=" + procedure_code
				+ ", idc9_diagnosis_code=" + idc9_diagnosis_code + ", idc9_dx_code=" + idc9_dx_code
				+ ", idc10_diagnosis_code=" + idc10_diagnosis_code + ", idc10_dx_code=" + idc10_dx_code
				+ ", street_name=" + street_name + ", street_number=" + street_number + ", street_suffix="
				+ street_suffix + ", time_zone=" + time_zone + ", provider_type=" + provider_type + ", specialty_care="
				+ specialty_care + ", provider_firstname=" + provider_firstname + ", provider_lastname="
				+ provider_lastname + ", provider_company=" + provider_company + ", patient_id=" + patient_id
				+ ", procedure=" + procedure + ", diagnosis=" + diagnosis + ", spouse=" + spouse + ", spouse_number="
				+ spouse_number + ", insurance=" + Insurance + ", Emergency=" + Emergency + ", MedicalRecords="
				+ MedicalRecords + "]";
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
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


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDuns_number() {
		return duns_number;
	}


	public void setDuns_number(String duns_number) {
		this.duns_number = duns_number;
	}


	public String getDrug_company() {
		return drug_company;
	}


	public void setDrug_company(String drug_company) {
		this.drug_company = drug_company;
	}


	public String getDrug_brand() {
		return drug_brand;
	}


	public void setDrug_brand(String drug_brand) {
		this.drug_brand = drug_brand;
	}


	public String getDrug_name() {
		return drug_name;
	}


	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}


	public String getFda_code() {
		return fda_code;
	}


	public void setFda_code(String fda_code) {
		this.fda_code = fda_code;
	}


	public String getProcedure_code() {
		return procedure_code;
	}


	public void setProcedure_code(String procedure_code) {
		this.procedure_code = procedure_code;
	}


	public String getIdc9_diagnosis_code() {
		return idc9_diagnosis_code;
	}


	public void setIdc9_diagnosis_code(String idc9_diagnosis_code) {
		this.idc9_diagnosis_code = idc9_diagnosis_code;
	}


	public String getIdc9_dx_code() {
		return idc9_dx_code;
	}


	public void setIdc9_dx_code(String idc9_dx_code) {
		this.idc9_dx_code = idc9_dx_code;
	}


	public String getIdc10_diagnosis_code() {
		return idc10_diagnosis_code;
	}


	public void setIdc10_diagnosis_code(String idc10_diagnosis_code) {
		this.idc10_diagnosis_code = idc10_diagnosis_code;
	}


	public String getIdc10_dx_code() {
		return idc10_dx_code;
	}


	public void setIdc10_dx_code(String idc10_dx_code) {
		this.idc10_dx_code = idc10_dx_code;
	}


	public String getStreet_name() {
		return street_name;
	}


	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}


	public String getStreet_number() {
		return street_number;
	}


	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}


	public String getStreet_suffix() {
		return street_suffix;
	}


	public void setStreet_suffix(String street_suffix) {
		this.street_suffix = street_suffix;
	}


	public String getTime_zone() {
		return time_zone;
	}


	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}


	public String getSpecialty_care() {
		return specialty_care;
	}


	public void setSpecialty_care(String specialty_care) {
		this.specialty_care = specialty_care;
	}


	public String getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}


	public String getProcedure() {
		return procedure;
	}


	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}


	public String getDiagnosis() {
		return diagnosis;
	}


	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}


	public String getSpouse() {
		return spouse;
	}


	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}


	public String getSpouse_number() {
		return spouse_number;
	}


	public void setSpouse_number(String spouse_number) {
		this.spouse_number = spouse_number;
	}


	public Insurance getInsurance() {
		return Insurance;
	}


	public void setInsurance(Insurance insurance) {
		this.Insurance = insurance;
	}


	public Emergency getEmergency() {
		return Emergency;
	}


	public void setEmergency(Emergency emergency) {
		Emergency = emergency;
	}


	public MedicalRecords getMedicalRecords() {
		return MedicalRecords;
	}


	public void setMedicalRecords(MedicalRecords medicalRecords) {
		MedicalRecords = medicalRecords;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}





	class Insurance {
		private String group_id;
		private String insurance_co;
		private String policy_number;
		private String hsa_account;
		
		
		public Insurance(String group_id, String insurance_co, String policy_number, String hsa_account) {
			this.group_id = group_id;
			this.insurance_co = insurance_co;
			this.policy_number = policy_number;
			this.hsa_account = hsa_account;
		}
		public String getGroup_id() {
			return group_id;
		}
		public void setGroup_id(String group_id) {
			this.group_id = group_id;
		}
		public String getInsurance_co() {
			return insurance_co;
		}
		public void setInsurance_co(String insurance_co) {
			this.insurance_co = insurance_co;
		}
		public String getPolicy_number() {
			return policy_number;
		}
		public void setPolicy_number(String policy_number) {
			this.policy_number = policy_number;
		}
		public String getHsa_account() {
			return hsa_account;
		}
		public void setHsa_account(String hsa_account) {
			this.hsa_account = hsa_account;
		}
		@Override
		public String toString() {
			return "Insurance [group_id=" + group_id + ", insurance_co=" + insurance_co + ", policy_number="
					+ policy_number + ", hsa_account=" + hsa_account + "]";
		}
				
//		@Override
//		public String toString() {
//			return "Insurance [BP=" + bp + ", bloodType=" + bloodType + "]";
//		}
	}
	
	class Emergency{
		private String emerg_contact;
		private String emerg_address;
		private String emerg_phnumber;
		
		
		
		
		public Emergency(String emerg_contact, String emerg_address, String emerg_phnumber) {
			this.emerg_contact = emerg_contact;
			this.emerg_address = emerg_address;
			this.emerg_phnumber = emerg_phnumber;
		}
		public String getEmerg_contact() {
			return emerg_contact;
		}
		public void setEmerg_contact(String emerg_contact) {
			this.emerg_contact = emerg_contact;
		}
		public String getEmerg_address() {
			return emerg_address;
		}
		public void setEmerg_address(String emerg_address) {
			this.emerg_address = emerg_address;
		}
		public String getEmerg_phnumber() {
			return emerg_phnumber;
		}
		public void setEmerg_phnumber(String emerg_phnumber) {
			this.emerg_phnumber = emerg_phnumber;
		}
		@Override
		public String toString() {
			return "Emergency [emerg_contact=" + emerg_contact + ", emerg_address=" + emerg_address
					+ ", emerg_phnumber=" + emerg_phnumber + "]";
		}
		
			
	}
	
	class MedicalRecords{
		private String bp;
		private String bloodType;
		private String weight;
		private String height;
		
		public MedicalRecords(String bp, String bloodType, String weight, String height) {
			this.bp = bp;
			this.bloodType = bloodType;
			this.weight = weight;
			this.height = height;
		}

		public String getBp() {
			return bp;
		}

		public void setBp(String bp) {
			this.bp = bp;
		}

		public String getBloodType() {
			return bloodType;
		}

		public void setBloodType(String bloodType) {
			this.bloodType = bloodType;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getHeight() {
			return height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		@Override
		public String toString() {
			return "MedicalRecords [bp=" + bp + ", bloodType=" + bloodType + ", weight=" + weight + ", height=" + height
					+ "]";
		}
		
		
		
	}

}
