public class Student {
    private String name;
    private String surname;
    private String age;
    
    
    public Student(String name, String surname, String age) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }


}
