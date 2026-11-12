class TowerOfHanoi
{
    public void towerhanoi(int n, char fromPeg, char toPeg, char auxPeg)
    {
        if(n==1)
        {
            System.out.println("Move disk fromPeg "+ fromPeg + " toPeg "+ toPeg);
            return ;
        }
        towerhanoi(n-1, fromPeg, auxPeg, toPeg);
        System.out.println("Move disk fromPeg "+ fromPeg + " toPeg "+ toPeg);
        towerhanoi(n-1, auxPeg, toPeg, fromPeg);
    }
    public static void main(String args[])
    {
        TowerOfHanoi obj = new TowerOfHanoi();
        obj.towerhanoi(3, 'A', 'C', 'B');
    }
}




// class TowerOfHanoi
// {
//     public void towerhanoi(int n, char fromPeg, char toPeg, char auxPeg)
//     {
//         if(n==1)
//         {
//             System.out.println("Move disk fromPeg "+ fromPeg + " toPeg "+ toPeg);
//             return;
//         }
//         towerhanoi(n-1, fromPeg, auxPeg, toPeg);
//         System.out.println("Move disk fromPeg "+ fromPeg + " toPeg "+ toPeg);
//         towerhanoi(n-1, auxPeg, toPeg, fromPeg);
//     }
//     public static void main(String args[])
//     {
//         TowerOfHanoi obj = new TowerOfHanoi();
//         obj.towerhanoi(6, 'A', 'C', 'B');
//     }
// }