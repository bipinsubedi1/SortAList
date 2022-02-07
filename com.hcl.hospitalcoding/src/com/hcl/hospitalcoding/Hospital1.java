package com.hcl.hospitalcoding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Hospital1 {
	public static void main (String[] args) {
		System.out.println ("---Sorting Patients---");
		List <Patient> listPatients = new ArrayList <Patient> ();
		listPatients.add (new Patient (123," Tom", 19));
		listPatients.add (new Patient (456, " Sam", 29));
		listPatients.add (new Patient (789, " Bob", 39));
		listPatients.add (new Patient (102, " Peter", 49));
		
		System.out.println ("---Before sorting---");
		for (Patient pat : listPatients) {
			System.out.println (pat);
		}
		
		System.out.println ("\n---Afetr Sorting---");
		Collections.sort(listPatients);
		System.out.println (listPatients);
	
	System.out.println ("---Sorting Doctors---");
	List <Doctor> listDoctors = new ArrayList <Doctor> ();
	listDoctors.add (new Doctor (345, " Tim", "Internal Medicine"));
	listDoctors.add (new Doctor (678, " Craig", "Surgery"));
	listDoctors.add (new Doctor (901, " Anne", "Family Medicine"));
	listDoctors.add (new Doctor (234, " Alex", "Pediatrics"));
	
	System.out.println ("---Before sorting---");
	for (Doctor doc : listDoctors) {
		System.out.println (doc);
	}
	
	System.out.println ("\n---After sorting---");
	Collections.sort(listDoctors);
	System.out.println(listDoctors);
	}
	}


