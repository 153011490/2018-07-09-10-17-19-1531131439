package practice04;

public class Worker {
    public Worker(String name, int age) {
        super(name, age);
    }
    @Override
    public String introduce() {
        return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Worker. I have a job.";
    }
}
