public class TestAddrss {
   public  static int   abc(int n){
        if  (n<=2){
            System.err.println(n+"里面");
            return 1;
        }
       System.err.println(n+"外面");
        return abc(n-1)+abc(n-2);
    }

    public static void main(String[] args) {
      /* int  i=1;
        System.err.println(++i+ ++i + ++i);*/
      int c;
      c=2;
        System.err.println(c);
        System.err.println(c++);
        System.err.println(c);
        System.err.println("黄俊杰");
    }
}
