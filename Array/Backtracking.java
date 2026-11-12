class Backtracking
{
    public void generate(int []arr, boolean[]used, String ans)
    {
        if(ans.length()==2)
        {
            System.out.println(ans);
            return ;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(used[i]==false)
            {
                used[i]=true;
                generate(arr, used, ans+arr[i]);
                used[i]=false;
            }
        }
    }
    public static void main(String args[])
    {
        Backtracking obj = new Backtracking();
        int []arr={1,2,3};
        boolean []used = new boolean[3];
        obj.generate(arr, used, "");
    }
}





// class Backtracking 
// {
//     public void generate(int []arr, boolean []used, String ans)
//     {
//         if(ans.length()==2)
//         {
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0; i<arr.length; i++)
//         {
//             if(used[i]==false)
//             {
//                 used[i]=true;
//                 generate(arr, used, ans+arr[i]);
//                 used[i]=false;
//             }
//         }
//     }
//     public static void main(String args[])
//     {
//         Backtracking obj = new Backtracking();
//         int []arr = {1,2,3};
//         boolean []used = new boolean[3];
//         String ans = "";
//         obj.generate(arr, used, ans);
//     }
// }