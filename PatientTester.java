public class PatientTester {
    public static void main(String[]args){
        PatientManager patientManager=new PatientManager();
        System.out.println(patientManager);
        Patient patient1=new Patient(1,200);
        Patient patient2=new Patient(2,400);
        Patient patient3=new Patient(3,600);
        Patient patient4=new Patient(4,800);
        patientManager.addPatient(patient1);
        patientManager.addPatient(patient2);
        patientManager.addPatient(patient3);
        patientManager.addPatient(patient4);
        System.out.println(patientManager);
    }
}
