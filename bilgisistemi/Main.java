public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("A","123","MAT");
        Teacher t2 = new Teacher("B","456","FZK");
        Teacher t3 = new Teacher("C","789","KMY");

        Course mat = new Course("Matematik","MAT101","MAT",0.8,0.2);
        mat.addTeacher(t1);
        Course fizik = new Course("Fizik","FZK101","FZK",0.6,0.4);
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya","KMY101","KMY",0.7,0.3);
        kimya.addTeacher(t3);

        Student s1 = new Student("H","001",4,mat,fizik,kimya);
        s1.addBulkExamNote(50,60,70,70,50,50);
        s1.isPass();
        Student s2 = new Student("Z","002",4,mat,fizik,kimya);
        s2.addBulkExamNote(40,40,60,60,50,50);
        s2.isPass();
        Student s3 = new Student("F","003",4,mat,fizik,kimya);
        s3.addBulkExamNote(90,900,40,40,60,60);
        s3.isPass();
    }
}