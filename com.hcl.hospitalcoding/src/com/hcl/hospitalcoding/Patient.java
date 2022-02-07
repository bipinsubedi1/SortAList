package com.hcl.hospitalcoding;

public class Patient implements Comparable <Patient>{
private int patientID;
private String patientName;
private int patientAge;

public Patient (int patientID, String patientName, int patientAge) {
	this.patientID = patientID;
	this.patientName = patientName;
	this.patientAge = patientAge;
}
public int getPatientID () {
	return patientID;
}
public void setPatientID (int patientID) {
	this.patientID = patientID;
}
public String getPatientName () {
	return patientName;
}
public void setPatientName (String patientName) {
	this.patientName = patientName;
}
public int getPatientAge () {
	return patientAge;
}
public void setPatientAge (int patientAge) {
	this.patientAge = patientAge;
}
@Override
public int compareTo(Patient o) {
	// TODO Auto-generated method stub
	int compare = patientName.compareTo (o.patientName);
	if (compare == 0) {
		compare = Integer.compare (patientID, o.patientID);
	}
return compare;
}
public String toString () {
	return ' ' + patientID + ' ' + patientName + ' ' + patientAge + "\n";
}
}
