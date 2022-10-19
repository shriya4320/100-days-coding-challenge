class Prac38{
    public static void main(String args[]){
        
        for(int i=1; i<=50; i++){
        int flah=0;
        
            for(int j=2; j<i; j++){
            if(i*j==0){
                flag=1;
            }
            }
            if(flag==0){
            System.out.println(i+"number is prime"); 
           
        }
            
            }
}