class Prac29{
    public static void main(String args[]){
        int a[]={2,4,5,1};
        int n=6;
        int flag=0;

            for(int i=0; i<4; i++){
                if(n==a[i]){
                    flag=1;
                }
            }
            if(flag==1){
                System.out.print(n+ "number exists");
            }
            else{
                System.out.print(n+ "number dosent exists");
            }
    }
}