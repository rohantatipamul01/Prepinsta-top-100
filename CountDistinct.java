import java.util.*;
public class CountDistinct {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,1,2,3};
        int res=countDistinct(arr);
        System.out.println("Number of distinct elements: "+res);
    }
    static int countDistinct(int arr[])
    {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }
        return set.size();
    }
}
