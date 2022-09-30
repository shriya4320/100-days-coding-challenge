//to check greatest//

class Prac3{
public static void main(String args[])
{
    int a,b,c,d;
    a=10;
    b=20;
    c=50;
    d=70;

    if(a>b && a>c && a>d)
    {
        System.out.println("a is greatest");
    }

    else if(b>a && b>c && b>d)
    {
        System.out.println("b is greatest");
    }

    else if(c>a && c>b && c>d)
    {
        System.out.println("c is greatest");
    }

    else
    {
        System.out.println("d is greatest");
    }
}

}