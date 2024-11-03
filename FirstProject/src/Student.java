public class Student {
    int rollNo = 21; // attributes, instance variable(class level variables)
    int x;
    float f = 1.23F;
    double d = f;

    void display(){
//        System.out.println("roll no is: " + rollNo);
//        System.out.println(x);
    }

    public static void main(String[] args){
        Student obj = new Student();
//        obj.rollNo=25;
        System.out.println(obj.f);
        System.out.println("as\"d");
        obj.display();
    }
}
