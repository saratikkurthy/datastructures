package com.project.ds.arrays;

public class MedianArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //Check if first array is smalles if not swap them to make sure always first array is smallest
        if(nums1.length>nums2.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        int low=0;
        int high=nums1.length;
        int totalLength=nums1.length+nums2.length;
        while(low <=high){
            int partA=(low+high)/2;
            int partB=(totalLength+1)/2 - partA;
            int maxLeftA = (partA == 0)? Integer.MIN_VALUE:nums1[partA-1];
            int minRightA = (partA == nums1.length)? Integer.MAX_VALUE : nums1[partA];
            int maxLeftB = (partB == 0)? Integer.MIN_VALUE:nums2[partB-1];
            int minRightB = (partB == nums2.length)? Integer.MAX_VALUE : nums2[partB];
            if(maxLeftA <= minRightB && maxLeftB <= minRightA){
                if((totalLength)%2 ==0){
                    return (double)(Math.max(maxLeftA,maxLeftB)+Math.min(minRightA,minRightB))/2.0;
                }
                else {
                    return  ((double) Math.max(maxLeftA,maxLeftB));
                }
            }
            else if(maxLeftA > minRightB){
                high = partA -1;
            }
            else {
                low = partA + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String... args){
        MedianArrays medArrays=new MedianArrays();
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println("Median of 2 sorted arrays is:"+medArrays.findMedianSortedArrays(nums1,nums2));
    }

}
