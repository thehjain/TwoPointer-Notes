//Here we have given an array and we have to find
//the water it can contain

//Brute Force approach is using two loops and
//time complexity will be O(N^2).

//Efficient approach using two pointer.

public int trap(int[] height) {
	int water = 0;
	int n = height.length;
	int[] left = new int[n];
	int[] right = new int[n];
	if (n == 0) return 0;
	left[0] = height[0];
	for (int i = 1; i < n; i++)
		left[i] = Math.max(left[i - 1], height[i]);
	right[n - 1] = height[n - 1];
	for (int i = n - 2; i >= 0; i--)
		right[i] = Math.max(right[i + 1], height[i]);
	for (int i = 0; i < n; i++)
		water += Math.min(left[i], right[i]) - height[i];
	return water;
}

//Time Complexity of this solution is O(N).

//We can do it without extra space as well.

public int trap(int[] height) {
	int water = 0;
	int n = height.length;
	int low = 0, high = n - 1;
	int left = 0, right = 0;
	while (low <= high) {
		if (height[low] < height[high]) {
			if (height[low] > left)
				left = height[low];
			else
				water += left - height[low];
			low++;
		} else {
			if (height[high] > right)
				right = height[high];
			else
				water += right - height[high];
			high--;
		}
	}
	return water;
}



//Problem is available both on leetcode and geeksforgeeks