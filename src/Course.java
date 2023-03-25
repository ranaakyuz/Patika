public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;
    double notePercent;
    double sozluPercent;

    Course(String name,String code,String prefix,double notePercent,double sozluPercent){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNote = 0;
        this.notePercent = notePercent;
        this.sozluPercent = sozluPercent;
    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.teacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
