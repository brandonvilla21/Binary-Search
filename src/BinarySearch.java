package src;
public class BinarySearch
{
    private int left, cen, right;
    private boolean flag;

    public BinarySearch() 
    {
    }

    public void binarySearch(int x, int[] array)
    {
        left = 0;
        right = array.length-1;
        flag = false;
        
        while (left <= right && flag == false)
        {
            cen = (right+left)/2;
            if (x == array[cen])
                flag = true;
            else
                if (x > array[cen])
                    left = cen+1;
                else
                    right = cen-1;
        }
        
        if (flag == true)
            System.out.println("\n" + x + " it is in the position " + cen + " from array.");
        else
            System.out.println("\n" + x + " it couldn´t find in array");
    }
}
