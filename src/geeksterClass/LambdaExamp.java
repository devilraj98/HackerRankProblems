package geeksterClass;

interface A{

    void show();

}
//
//class B implements A{
//
//    public void show()
//    {
//
//        System.out.println("Hello");
//
//    }
//
//
//
//}



public class LambdaExamp {

    public static void main(String[] args) {

        A obj;
//        obj = new A(){                          // Annonymous class
//            public void show() {
//                System.out.println("Hello");
//
//            }
//        };

//        obj = () ->                                             //Lambda Expression
//        {
//            System.out.println("Hello");
//        };

        obj = ()-> System.out.println("hello");         //Lambda Expressin


        obj.show();

    }




}
