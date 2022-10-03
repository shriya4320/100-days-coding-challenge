//prime or not prime number//

class Prac9{
    public static void main(String args[])
    {
        int n=11;
        int flag=0;

        for(int i=2; i<n; i++){
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(n+"num is prime");
        }
        else{
            System.out.println(n+"num is prime");
        }
    }
}