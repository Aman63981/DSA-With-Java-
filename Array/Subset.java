class Subset
{
    public void findSubset(int []arr,int idx, String ans)
    {
        if(idx==arr.length)
        {
            System.out.println("["+ ans + "]");
            return;
        }
        findSubset(arr, idx+1, ans+arr[idx]+" ");
        findSubset(arr, idx+1, ans);
    }
    public static void main(String args[])
    {
        Subset obj = new Subset();
        obj.findSubset(new int[]{1,2,3,4}, 0, "");
    }
}