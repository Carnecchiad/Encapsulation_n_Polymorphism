package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	void assignPatient(Patient p) throws DoctorFullException {
		if(patients.size()<3) {
		patients.add(p);
		}else {
			throw new DoctorFullException();
		}
	}
	ArrayList<Patient> getPatients(){
		return patients;
	}
	void doMedicine() {
		for(Patient p : patients) {
			p.checkPulse();
		}
	}
	boolean performsSurgery() {
		return false;
	}
	boolean makesHouseCalls() {
		return true;
	}
}
