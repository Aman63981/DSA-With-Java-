class BinaryString
{
    public void generate(String ans, int n)
    {
        if(ans.length()==n)
        {
            System.out.println(ans);
            return;
        }
        generate(ans+"0", n);
        generate(ans+"1", n);
    }
    public static void main(String args[])
    {
        BinaryString obj = new BinaryString();
        obj.generate("", 5);
    }
}