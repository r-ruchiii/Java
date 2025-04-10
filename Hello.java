class Hello
{
    public static void main(String args[]){
        int value = 9;
        
        int answer = ++value;

        System.out.println(answer);
        
        value = 9;
        answer = value++;
        System.out.println(answer);
   

    }        

}