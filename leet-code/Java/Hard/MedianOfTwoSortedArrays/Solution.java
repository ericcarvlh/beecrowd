package Java.Hard.MedianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[]{-65, -23, 4};
        int[] nums2 = {-43, -30, 2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] numsMerged = new int[nums1.length+nums2.length];

        System.arraycopy(nums1, 0, numsMerged, 0, nums1.length);

        for (int sortedIndex = nums1.length, index = 0; index < nums2.length; sortedIndex++, index++) {
            numsMerged[sortedIndex] = nums2[index];
        }

        for (int mainIndex = 0; mainIndex < numsMerged.length; mainIndex++){
            int num = numsMerged[mainIndex];
            for (int secondaryIndex = mainIndex; secondaryIndex < numsMerged.length; secondaryIndex++) {
                if (num > numsMerged[secondaryIndex]) { // entao o "numsMerged[secondaryIndex]" é menor
                    int valorAuxiliar = num;
                    num = numsMerged[secondaryIndex];
                    numsMerged[secondaryIndex] = valorAuxiliar;
                }
            }
            numsMerged[mainIndex] = num;
        }

        int numsSortedSize = numsMerged.length;
        if (numsSortedSize % 2 == 0) {// pegamos os 2 item que se encontram no meio e o seu antecessor.
            double num1 = numsMerged[numsSortedSize/2];
            double num2 = numsMerged[(numsSortedSize/2)-1];
            return (num1 + num2) / 2;
        } else
            return numsMerged[(numsSortedSize/2)];
    }
}
