public class LargestValue {
    public static int larger(int num[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(largest<num[i])
            {
                largest =num[i];
            }
        }
        System.out.println("largest value is:"+largest);
        return largest;
    }
    public static void main(String args[])
    {
        int num[]={1,2,6,55,44,9999,1234,3,5};
        
        System.out.println(larger(num));
    }
    
}