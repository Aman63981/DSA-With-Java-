class Factorial
{
    public long fact(long n)
    {
        if(n<=1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String args[])
    {
        Factorial obj = new Factorial();
        for(int i=0; i<=10; i++)
        {
            System.out.printf("%d! = %d\n", i ,  obj.fact(i));
        }
    }
}