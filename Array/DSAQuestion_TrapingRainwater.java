package Array;

public class DSAQuestion_TrapingRainwater {
    public static void TrappedWater(int[] height, int width)
    {
         
        // calculate left max for each element
        int[] L_max= new int[height.length];
        L_max[0] = height[0];
        for(int i=1;i<height.length;i++)
        {
            L_max[i]=Math.max(height[i],L_max[i-1]);
        }

        // calculate right max for each element
        int[] R_max= new int[height.length];
        R_max[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            R_max[i]=Math.max(height[i],R_max[i+1]);
        }

        //In loop..
        int TrappedWater=0;
        for(int i=0;i<height.length;i++)
        {
            // water level = min(left_max, right_max) 
            int waterLevel = Math.min(L_max[i], R_max[i]);
            // Trapped water = water level - height of the bar
            TrappedWater += waterLevel - height[i] * width;
        }
        System.out.println("Trapped Water is: " + TrappedWater);

    }
        

    
    public static void main(String[] args) {
        int[]height={4,2,0,6,3,2,5};
        int width = 1; 
        TrappedWater(height,width);
    }
}
