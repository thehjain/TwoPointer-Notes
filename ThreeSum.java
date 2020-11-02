//Here we have to find the three numbers from array
//whose sum is equal to given sum

//One basic approach is using three loops

//Another efficient approach is using two pointers.

public List<List<Integer>> threeSum(int[] arr) {
	List<List<Integer>> res = new ArrayList<>();

	int n = arr.length;
	Arrays.sort(arr);

	for (int i = 0; i < n - 2; i++) {
		if (i > 0 && arr[i] == arr[i - 1]) continue;
		int low = i + 1; int high = n - 1;
		int x = arr[i];
		while (low < high) {
			if (x + arr[low] + arr[high] == 0) {
				res.add(Arrays.asList(x, arr[low], arr[high]));
				low++; high--;
				while (low < high && arr[low] == arr[low - 1]) low++;
				while (low < high && arr[high] == arr[high + 1]) high--;
			} else if (x + arr[low] + arr[high] < 0) low++;
			else high--;
		}
	}
	return res;
}


//Problem is available on leetcode