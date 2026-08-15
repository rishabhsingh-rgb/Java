

public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //default ctor
       /*  Student A= new Student();
        A.id=1;
        A.age=6;
        A.name="ranu";
        A.nos=5;
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);

        A.sleep();
        A.study();*/

        //Parametrised constructoor
        Student B=new Student(4,10,"Ramu",5,"Tina");
        System.out.println(B.getname());
        System.out.println(B.getAge());
        B.setAge(40);
        System.out.println(B.getAge());
        //System.out.println(B.name);
        //System.out.println(B.age);
        System.out.println(B.nos);
      //  System.out.println(B.gf);  not accessible

        B.sleep();
        B.study();
        //B.gfChatting(); not accessible

        Student C=new Student(B);
        //System.out.println(C.name);
        //System.out.println(C.age);
        System.out.println(C.nos);

        C.sleep();
        C.study();
    }
}
