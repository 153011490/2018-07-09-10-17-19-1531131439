package practice03;

package practice02;

public class Student extends Person{
    private int klass;

    public Student(String name, int age, int kclass) {
        super(name, age);
        this.kclass = kclass;
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class "+this.kclass+".";
    }

    public int getKlass() {
        return kclass;
    }
}
