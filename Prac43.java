

class Prac43{
public static void main(String args[])
{
    int a,b,c,d;
    a=30;
    b=23;
    c=80;
    d=100;

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