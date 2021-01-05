public class Student {
    private Integer age;
    private String name;
    private String email;

    public Student() {
    }

    public Student(Integer age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
