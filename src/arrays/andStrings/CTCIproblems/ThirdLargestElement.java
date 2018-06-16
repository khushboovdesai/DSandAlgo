/*
package arrays.andStrings.CTCIproblems;

*/
/**
 * Created by khush on 6/4/2018.
 *//*


import java.util.Arrays;
public class ThirdLargestElement {

    class Solution {
        public int thirdMax(int[] nums) {
            int arrSize = nums.length;
            int sz = nums.length;
            int counter=0;
            int mx=nums[0];
            int i;
            int tmp[] = new int[4];
            int res ;

            if(arrSize>2){

                while(counter!=3){
                    for(i=1;i<sz;i++){
                        mx = Math.max(mx, nums[i]);
                    }
                    tmp[counter]=mx;
                    nums = array.removeElement(nums, mx);
                    sz=nums.length;
                    counter++;
                }
                res = tmp[counter--];
                return res;
            }

            else{
                res = maxInt(nums);
            }
            return res;

        }

        public int maxInt(int[] nums){
            int res;

            if(nums.length==0){
                return 0;
            }
            else if(nums.length==1)
                return nums[0];

            else{
                res = nums[0]>nums[1] ? nums[0] : nums[1];
                return res;
            }


        }
    }
}
*/
