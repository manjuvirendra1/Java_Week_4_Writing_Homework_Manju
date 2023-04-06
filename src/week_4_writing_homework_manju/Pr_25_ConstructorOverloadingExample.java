package week_4_writing_homework_manju;
/**
 *25. Example of Constructor Overloading
 * //Java program to overload constructors
 * class Student5{
 *  int id;
 *  String name;
 *  int age;
 *  //creating two arg constructor
 *  Student5(int i,String n){
 *  id = i;
 *  name = n;
 *  }
 *  //creating three arg constructor
 *  Student5(int i,String n,int a){
 *  id = i;
 *  name = n;
 *  age=a;
 *  }
 *  public void display(){System.out.println(id+" "+name+" "+age);}
 *  public static void main(String args[]){
 *  Student5 s1 = new Student5(111,"Karan");
 *  Student5 s2 = new Student5(222,"Aryan",25);
 *  s1.display();
 *  s2.display();
 *  }
 * }
 * Output:
 * 111 Karan 0
 * 222 Aryan 25
 */
public class Pr_25_ConstructorOverloadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Pr_25_ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Pr_25_ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Pr_25_ConstructorOverloadingExample s1 = new Pr_25_ConstructorOverloadingExample(111, "Karan");
        Pr_25_ConstructorOverloadingExample s2 = new Pr_25_ConstructorOverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
