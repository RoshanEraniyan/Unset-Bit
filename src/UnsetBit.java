import java.util.*;

class Solution
{
    public void unsetbit(int n,int index)
    {
        int solution=0;
        if((n&(1<<index))==0)
        {
            solution=n;
        }
        else
        {
            solution=(int)(n-Math.pow(2,index));
        }
        System.out.println(solution);
    }
}

class UnSetBit
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=scanner.nextInt();
        Solution solution =new Solution();
        solution.unsetbit(n,i);
    }
}
