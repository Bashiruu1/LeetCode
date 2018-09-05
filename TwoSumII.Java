class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int j = numbers.length - 1;
        int sum = 0;
        
        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] {i+1, j+1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }throw new IllegalArgumentException("No solution");
        
    }
    
    /*
        ***FOR SORTED INPUT***
        tried BST, but that was a lot of code so tried this way and this way is pretty fast and less code
        basically this code will set i to 0 and j to length of array - 1, then adds then in a while loop
        if their sum is equal to the target return the array indicies + 1 because we need to return +1 version
        then if sum is < target increment i.. meaning that j is likely in a good spot, but i is not big enough
        else if sum is > target decrement j.. meaning that i is likely in a good spot, but k is not small enough.
        throw new IllegalArgumentException at the end.
        
        O(n) time & O(1) space.
    */
}
