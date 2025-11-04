public class KLTN<T extends Student, V> implements Comparable<KLTN<T,V>>{
    private String thesisName;
    private T student;
    private V nameHelper;

    public KLTN(String thesisName, T student, V nameHelper) {
        this.thesisName = thesisName;
        this.student = student;
        this.nameHelper = nameHelper;
    }

    public String getThesisName() {
        return thesisName;
    }
    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public T getStudent() {
        return student;
    }
    public void setStudent(T student) {
        this.student = student;
    }

    public V getNameHelper() {
        return nameHelper;
    }
    public void setNameHelper(V nameHelper) {
        this.nameHelper = nameHelper;
    }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.thesisName.compareToIgnoreCase(other.thesisName);
    }

    @Override
    public String toString() {
        return "KLTN{" +
                "thesisName='" + thesisName + '\'' +
                ", student=" + student +
                ", nameHelper=" + nameHelper +
                '}';
    }
}
