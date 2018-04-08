package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public Hospital() {
		
	}
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	ArrayList<Patient> getPatients(){
		return patients;
	}
	void addPatient(Patient p) {
		patients.add(p);
	}
	public void assignPatientsToDoctors() {
		int i = 0;
		for(Doctor d: doctors) {
			i = 0;
			for(Patient p : patients) {
				
			}
		}
	}
}
