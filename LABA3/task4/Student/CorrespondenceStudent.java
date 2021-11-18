package task4.Student;

public class CorrespondenceStudent extends Student{
    private int[] recordBook;

    public CorrespondenceStudent(String name, String surname, String faculty, String group, int[] recordBook) {
        super(name, surname, faculty, group);
        this.recordBook = recordBook;
    }

    public int[] getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(int[] recordBook) {
        this.recordBook = recordBook;
    }
}
