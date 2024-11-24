public class Polymorphism {
    public static void main(String[] args){
        System.out.println("abc");
        Area a = new Area();
//        a.area();
        a.area(2);
        a.area(2,4);
        a.area(4);
    }
}
class Area {
    void area(){
        System.out.println("area 1");
    }
    void area(int a){
        System.out.println("area 2");
    }
    void area(int a,int b){
        System.out.println("area 3");
    }
}
