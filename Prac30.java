import java.util.Scanner;
class Prac30{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int a[][]= new int [3][4];
        System.out.print("Enter 12 elements in an array");

            for(int i=0; i<a.length; i++){
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