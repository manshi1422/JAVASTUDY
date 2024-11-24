public class Main {
    public static void main(String[] args) {
        Manshi m1 = new Manshi();
//m1.complexion="undefined";
//        Manshi m2 = new Manshi(m1);
//        System.out.println(m2.complexion);
        System.out.println("m1.complexion");
//        m1.dance();


    }
}
class Manshi {
    String complexion;
    String behaviour;
    int age;

    public void dance(String age,String d){
        System.out.println("yes she can dance");
    }
    public void dance(String a){
        System.out.println("yes she can dance");
    }
//     Manshi(Manshi m1){
//        this.complexion=m1.complexion;
//    }
//    Manshi(){
//
//    }
}