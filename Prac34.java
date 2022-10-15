class Prac34{
    public static void main(String args[]){
        int a=0;
        int b=1;
        int c=1;
        int d=0;

        System.out.println("Tribonacci series");

        while(d<=100){
            d=a+b+c;
            System.out.println(d);
            a=b;
            b=c;
            c=d;

        }
    }
}