import java.util.ArrayList;
public class PatientManager {
    ArrayList<Patient> patients=new ArrayList<Patient>(10);

    public PatientManager(){
        this.patients=new ArrayList<Patient>(10);
    }

    public int addPatient(Patient patient){
        patients.add(patient);
        return patients.indexOf(patient);
    }

    public Patient removePatient(int index){
        Patient oldPatient=patients.get(index);
        patients.remove(index);
        return oldPatient;
    }

    public int caffeineAbsorbtion(){
        for(int i=0;i<patients.size();i++){
            patients.get(i).caffeineLevel-=160;
            }
        for(int i=patients.size()-1; i>=0; i--){
            if(patients.get(i).caffeineLevel<0){
                removePatient(i);
        }
    }
        return 0;
    }

    public String toString(){
        int patientCount=0;
        for(int i=0; i<patients.size();i++){
            if(patients.get(i)!=null){
                patientCount+=1;
            }
        }
        if(patientCount==0){
            return "Empty";
        }
        else{
        String patientsString="";
        for(int n=0; n<patients.size();n++){
            if(patients.get(n)!=null){
                String tempString="\n"+patients.get(n).idNumber+" "+patients.get(n).caffeineLevel;
                String oldString=patientsString;
                patientsString=oldString+tempString;
               }
            }
            return patientsString;
        }
    }
}
