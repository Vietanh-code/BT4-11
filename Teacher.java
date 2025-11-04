public class Teacher {
    private String fullname;
    private String id;
    private  String email;
    private String title;

    public Teacher(String fullname, String id, String email, String title) {
        this.fullname = fullname;
        this.id = id;
        this.email = email;
        this.title = title;
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

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher:" + "fullname='" + fullname + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                '.';
    }
}
