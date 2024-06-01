public class Student {
    private String name;
    private int attendanceNum;
    private Attendance attendance;
    private EducationLevel educationLevel;
    private double gpa;
    private int verilenDersSayisi;
    private Fakulte fakulte;

    public Student(String name, Attendance attendance, EducationLevel educationLevel,double gpa, Fakulte fakulte){
        this.name = name;
        this.attendance = attendance;
        this.educationLevel = educationLevel;
        this.gpa = gpa;
        this.fakulte = fakulte;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Attendance getAttendance(){
        return attendance;
    }
    public void setAttendance(Attendance attendance){
        this.attendance = attendance;
    }
    public EducationLevel getEducationLevel(){
        return educationLevel;
    }
    public void setEducationLevel(EducationLevel educationLevel){
        this.educationLevel = educationLevel;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public int getAttendanceNum(){
        return attendanceNum;
    }
    public void setAttendanceNum(int attendanceNum){
        this.attendanceNum = attendanceNum;
    }
    public int getVerilenDersSayisi(){
        return verilenDersSayisi;
    }
    public void setVerilenDersSayisi(int verilenDersSayisi){
        this.verilenDersSayisi = verilenDersSayisi;
    }

    public Fakulte getFakulte() {
        return fakulte;
    }

    public void setFakulte(Fakulte fakulte){
        this.fakulte = fakulte;
    }

    public String mezunDurumu(){
        if(this.educationLevel.graduation(this.getGpa()) && this.attendance.isAttendance(this.getAttendanceNum()) && this.fakulte.dersSayisi(this.getVerilenDersSayisi())){
            return "Mezun olabilir";
        }
        return "Mezun olamaz";
    }

}
