public class Main {
    public static void main(String[] args) {
        Student omer = new Student("omerim",new FullTime(),new UnderGraduate(),2.6,new Muhendislik());

        omer.setAttendanceNum(151);
        System.out.println(omer.mezunDurumu());
        omer.setEducationLevel(new Graduate());
        omer.setGpa(2.8);
        omer.setVerilenDersSayisi(300);

        System.out.println(omer.mezunDurumu());
    }
}