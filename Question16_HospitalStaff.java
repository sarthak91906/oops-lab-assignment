class Staff {
    public void work() {
        System.out.println("Staff member is working");
    }
}

class Doctor extends Staff {
    @Override
    public void work() {
        System.out.println("Doctor is diagnosing patients and prescribing medicine");
    }
}

class Nurse extends Staff {
    @Override
    public void work() {
        System.out.println("Nurse is taking care of patients and administering medication");
    }
}

class Receptionist extends Staff {
    @Override
    public void work() {
        System.out.println("Receptionist is handling appointments and patient records");
    }
}

public class Question16_HospitalStaff {
    public static void main(String[] args) {
        Staff[] staff = new Staff[4];
        staff[0] = new Staff();
        staff[1] = new Doctor();
        staff[2] = new Nurse();
        staff[3] = new Receptionist();
        
        System.out.println("=== Hospital Staff Responsibilities ===");
        for (Staff s : staff) {
            s.work();
        }
    }
}
