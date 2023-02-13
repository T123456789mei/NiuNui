package pks;

public class MaoPao {
    public  void sss(String[] args){
        int[] nums = {90,124,346,23,6346,12,63,1235,135};
        int temp = 0;
        for (int i = 0; i <nums.length-1; i++){
            for (int j = 0;j< nums.length -1 -i; j++){
                if (nums[j] >nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j +1];
                    nums[j + 1] =temp;
                }

            }
        }
        System.out.print("从小到大的排序结果是:");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+",");
        }

        System.out.print("从小到大的排序结果是:");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+",");
        }
    }



}

