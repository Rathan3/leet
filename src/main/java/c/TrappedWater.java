package c;

public class TrappedWater {
    public int trap(int[] height) {
        if(height.length<=2){
            return 0;
        }
        int start=0;
        int end=height.length-1;
        int trappedWater=0;
        for(int i=start;i<height.length;i++){
            if(height[i] >= height[start]){
                trappedWater=trappedWater+ calculateTrappedWater(start,i,height);
                start=i;
            }
        }
        System.out.println("start = "+start);
        if(start<height.length-1){
            for(int i=height.length-1;i>=start;i--){
                if(height[i] >= height[end]){
                    System.out.println("end = "+end+" start = "+i);
                    int i1 = calculateTrappedWater(i, end, height);
                    System.out.println(i1);
                    trappedWater=trappedWater+ i1;
                    end=i;
                }
            }
        }

        return trappedWater;
    }
    int calculateTrappedWater(int start,int end,int[] height){
        int water=0;
        int base=start;
        if(height[end]<height[start]){
            base=end;
            water=height[start]-height[base];
        }
        else{
            water=height[end]-height[base];
        }
        for(int i=start;i<=end;i++){
            water=water+height[base]-height[i];
        }
        return water;
    }
}
