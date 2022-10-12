import java.util.Scanner;
class Prac31{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number of students and subject");
        int student= sc.nextInt();
        int subject= sc.nextInt();

      int a[][]= new int [student][subject];

            for(int i=0; i<a.length; i++){
                    System.out.print("Enter "+a[i].length+" subject marks for"+(i+1)+"student");

                for(int j=0; j<a[i].length; j++){
                    a[i][j]=sc.nextInt();
                }
            }
                System.out.print("Given matrix is:");
                    for(int i=0; i<a.length; i++){
                        for(int j=0; j<a[i].length; j++){
                            System.out.print(a[i][j]+"");
            }
                        System.out.println();
        }

    }
}