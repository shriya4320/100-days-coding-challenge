//adition of 1-50 and show odd count

class Prac8{
    public static void main(String args[])
    {
        int i;
        int a=0;

        for(i=1; i<=50; i++)
        {
                if(i%2==0)
                {
                    System.out.println(i);
                    a++;
                }
        }
        System.out.println(a+"The total is");
    }

}