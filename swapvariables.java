public class swapvariables {
    public static void main(String[] args) {
        String x="lemon";
        String y="juice";
        String temp;
        //swapping variable with a third variable
        temp=x;
        x=y;
        y=temp;
        System.out.println("x is "+x);
        System.out.println("y is "+y);
    }
    
}
