class Admission {
    void admissionProcess() {
        System.out.println("General admission process");
    }
}

class UndergraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Undergraduate Admission: Merit + Entrance Test");
    }
}
class PostgraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Postgraduate Admission: Written Test + Interview");
    }
}
public class Admissionprocess{
    public static void main(String[] args) {
        Admission ug = new UndergraduateAdmission();     
        Admission pg = new PostgraduateAdmission();

        ug.admissionProcess(); 
        pg.admissionProcess(); 
    }
}