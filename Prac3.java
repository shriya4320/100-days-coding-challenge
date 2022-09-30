//marks//

class Prac3{
public static void main(string args[])
{
    int marks=30;

    if(marks>=70)
    {
        System.out.println("A+ grade");
    }

    else if(marks>=60 && marks<70)
    {
        System.out.println("A grade");
    }

    else if(marks>=50 && marks<60)
    {
        System.out.println("B grade");
    }

    else if(marks>=40 && marks<50)
    {
        System.out.println("C grade");
    }

    else if(marks>=35 && marks<40)
    {
        System.out.println("D grade");
    }

    else
    {
        System.out.println("FAIL");
    }
}

}