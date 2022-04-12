
    public class student extends person{
        public void walk(){
            System.out.println("He is walking on road");
        }
        public void cooking(){
            System.out.println("I will cook biriyani very well*");
        }
    }

//public class student extends person{
//    public void first(){
//        System.out.println("This is the first abstract method");
//    }
//    public  void second(){
//        System.out.println("This is the sencond abstract method");
//    }
//    public void third(){
//        System.out.println("This is the last abstract method");
//    }
//
//}

//abstract class student extends person {
//    public void first() {
//        System.out.println("This is the first abstract method");
//    }
//
//    public void second() {
//        System.out.println("This is the sencond abstract method");
//    }
//}
//        ******* for the abstract methods it is possible to provide arguments.****
//public class student{
//     int m1(int a,int b){
//         int c;
//         System.out.println("this is absract one!!!");
//         System.out.println("first value : "+a);
//         System.out.println("second value : "+b);
//         c=a+b;
//         return c;
//     }
//     boolean m2(String ch){
//         System.out.println("This is second abstract@@");
//         System.out.println(ch);
//         return true;
//     }
//     public static void main(String[] args){
//         student obj=new student();
////         person obj1=new person();
//         int x = obj.m1(5000,200);
//         System.out.println("Total : "+x);
//         System.out.println("Succesfully complied !!!!");
//         System.out.println("---------------------------");
//         boolean b =obj.m2("Shaik moulali");
//         System.out.println(b);
//         person.m3("Hello world !!!!!!");
////         person.m4("hello Nellore");
//
//     }
//}