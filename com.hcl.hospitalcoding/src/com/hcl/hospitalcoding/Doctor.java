package com.hcl.hospitalcoding;

public class Doctor implements Comparable <Doctor> {
	private int doctorID;
	private String doctorName;
	private String doctorSpecialty;
	
	public Doctor (int doctorID, String doctorName, String doctorSpecialty) {
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.doctorSpecialty = doctorSpecialty;
	}		
		public int getDoctorID() {
			return doctorID;
		}
		public void setDoctorID (int doctorID) {
			this.doctorID = doctorID;
		}
		public String getDoctorName () {
			return doctorName;
		}
		public void setDoctorName (String doctorName) {
			this.doctorName = doctorName;
		}
		public String getDoctorSpecialty () {
			return doctorSpecialty;
		}
		public void serDoctorSpecialty (String doctorSpecialty) {
			this.doctorSpecialty = doctorSpecialty;
		
	}

	@Override
	public int compareTo(Doctor o) {
		// TODO Auto-generated method stub
		int compare = doctorName.compareTo(o.doctorName);
		if (compare == 0) {
			compare = Integer.compare (doctorID, o.doctorID);
		}
		return compare;
	}
	public String toString () {
		return ' ' + doctorID + ' ' + doctorName + ' ' + doctorSpecialty + "\n";
	}
}
