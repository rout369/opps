package opps;

import java.util.Scanner;

public class construct {
//    construct(){ // default constructer....
//        Scanner sc = new Scanner(System.in);
//        int n;
//        n = sc.nextInt();
//        System.out.println(n);
//    }

    int id;
    String s;
    construct(int i , String a){
        id = i;
        s = a;
    }

    void display(){
        System.out.println("name:-> "+s + " , " + "ID:-> "+ id);
    }


    public static void main(String[] args) {
        construct stu1 = new construct(3 , "Dev");
        construct stu2 = new construct( 6 , "Devid");
        stu1.display();
        stu2.display();
    }
}
