class Prac25{
    public static void main(String args[]){
        for(int i=65; i<=68; i++){
            for(int k=68; k>i; k--){
                System.out.print(" ");
            }
            for(int j=i; j>=65; j--){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}