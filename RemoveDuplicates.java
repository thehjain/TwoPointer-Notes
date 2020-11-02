//Here we have given a sorted array and
//we have to remove the duplicate elements

//Basic approach is to use another array

//Efficient approach is to use two pointer approach


public int removeDuplicates(int[] nums) {
	int index = 1;
	for (int i = 1; i < nums.length; i++)
		if (nums[i] != nums[i - 1])
			nums[index++] = nums[i];
	return index;
}


//Problem is available on leetcode