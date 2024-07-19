package ca.ucalgary.ensf380;


public class University {

	public static void main(String[] args) {
		  Address profAddress = new Address();
	        profAddress.setStreet("123 Professor St");
	        profAddress.setCity("Calgary");
	        profAddress.setState("AB");
	        profAddress.setPostalCode("T2N 1N4");
	        profAddress.setCountry("Canada");

	        Address studentAddress = new Address();
	        studentAddress.setStreet("456 Student Ave");
	        studentAddress.setCity("Calgary");
	        studentAddress.setState("AB");
	        studentAddress.setPostalCode("T2N 1A1");
	        studentAddress.setCountry("Canada");

	        // Create Professors
	        Professor prof = new Professor();
	        prof.setName("Dr. Smith");
	        prof.setPhoneNumber("123-456-7890");
	        prof.setEmailAddress("dr.smith@university.ca");
	        prof.setAddress(profAddress);
	        prof.setTeacherNumber("T001");
	        prof.setSalary(80000);

	        // Create Students
	        Student student = new Student();
	        student.setName("Greg Johnson");
	        student.setPhoneNumber("098-765-4321");
	        student.setEmailAddress("alice.johnson@university.ca");
	        student.setAddress(studentAddress);
	        student.setStudentNumber(student.nextPersonalNumber());
	        student.setAverageMark(85.5);
	        student.setSupervisor(prof);

	        // Print details
	        System.out.println("Student: " + student.getName());
	        System.out.println("Student Number: " + student.getStudentNumber());
	        System.out.println("Student Address: " + studentAddress.outputAsLabel());
	        System.out.println("Valid Address? " + student.hasValidAddress());
	        System.out.println("Average Mark: " + student.getAverageMark());
	        System.out.println("Supervisor: " + student.getSupervisor().getName());
	        System.out.println("Supervisor Phone: " + student.getSupervisor().getPhoneNumber());
	        System.out.println("Valid Address? " + prof.hasValidAddress());
	        System.out.println("Professor Address: " + profAddress.outputAsLabel());
	        System.out.println("Eligible to Enroll: " + student.isEligibleToEnroll());
	    }

	}

