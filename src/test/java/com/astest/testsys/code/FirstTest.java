package com.astest.testsys.code;
import org.junit.Test;

/**
 * @author: zhaoning01
 * Date: 2020/5/6
 * Description: xxxx
 */
public class FirstTest {

    @Test()
    public void twoSumTest(){

        int [] nums = {2,3,1,11,15};
        int target =5;
        First test = new First();
        test.twoSum(nums,target);
    }
    @Test()
    public void twoSumTest2(){

        int [] nums = {2,3,1,11,15};
        int target =5;
        First test = new First();
        test.twoSums(nums,target);


    }
}
