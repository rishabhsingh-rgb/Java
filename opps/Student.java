public class Student {
    //Attributes
    public int id;
    private int age;
    private String name;
    public int nos;
    private String gf;


    public String getname(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        this.age=a;
    }
    //Default constructor //By default attributes-> garbage
    public Student(){
        System.out.println("Student Default ctor called");
    }

    //Parametrised ctor
    public Student(int id ,int age, String name, int nos, String gf){
        System.out.println("Student parameterised ctor called");
        this.id=id;
        this.age=age;
        this.name=name;
        this.nos=nos;
        this.gf=gf;
    }

    //copy ctor
    public Student(Student srcobj){
        System.out.println("Student copy ctor called");
        this.id=srcobj.id;
        this.age=srcobj.age;
        this.name=srcobj.name;
        this.nos=srcobj.nos;
    }

    //Methods
    public void study(){
        System.out.println(name+ " Studying");
    }

    public void sleep(){
        System.out.println(name+ " Sleeping");
    }

    private void gfChatting(){
        System.out.println(name+" gf chatting");
    }

}
