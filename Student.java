public class Student {
    private String fullname;
    private String id;
    private  String email;

    public Student(String fullname, String id, String email) {
        this.fullname = fullname;
        this.id = id;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student:" +
                "fullname='" + fullname + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '.';
    }
}
