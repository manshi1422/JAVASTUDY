public class Inheritence {
public static void main(String args[]){
    System.out.println("inheritence");
    B objectofA = new B();
    objectofA.property="abc";
    System.out.println(objectofA.property);
}
}
class A{
    String property;
}
class B extends A{

}