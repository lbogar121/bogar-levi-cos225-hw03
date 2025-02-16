import java.util.ArrayList;
public class PatientManager {
    ArrayList<Patient> patients=new ArrayList<Patient>(10);

    public PatientManager(){
        this.patients=new ArrayList<Patient>(10);
    }

    public int addPatient(Patient patient){
        for(int i=0;i<patients.size();i++){
            if(patients.get(i)==null){
                patients.add(patient);
                return i;
            }
        }
        return -1;
    }

    public Patient removePatient(int index){
        Patient oldPatient=patients.get(index);
        patients.remove(index);
        return oldPatient;
    }

    public int caffeineAbsorbtion(){
        for(int i=0;i<patients.size();i++){
            if(patients.get(i)!=null){
                Patient tempPatient=patients.get(i);
                tempPatient.caffeineLevel-=160;
                if(tempPatient.caffeineLevel<0){
                    removePatient(i);
                }
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
                String tempString="ID Number: "+patients.get(n).idNumber+"; Caffeine Level: "+patients.get(n).caffeineLevel+"\n";
                String oldString=patientsString;
                patientsString=oldString+tempString;
               }
            }
            return patientsString;
        }
    }
}
