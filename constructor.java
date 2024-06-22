package opps;
// constructor over loading.....
public class construct2 {
    int id ;
    String name;
    int age;
    construct2(int i , String n){
        id = i;
        name = n;
    }
    construct2(int i , String n , int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name:-> " + name + " ID:-> " + id + " Age:-> " + age + " Years");
    }

    public static void main(String[] args) {
        construct2 stu1 = new construct2(3, "Kumar");
        construct2 stu2 = new construct2(6 , "Satan" , 10000000);

        stu1.display();
        stu2.display();
    }
}
