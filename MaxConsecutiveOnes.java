//Here we have given an array or string consisting of
//only one's and zero's

//We have to return number representing maximum consective
//one's

//Basic approach is to run a single loop and count
//the maximum number of consecutive one's.

public int findMaxConsecutiveOnes(int[] nums) {
	int res = 0, curr = 0;
	for (int ele : nums) {
		if (ele == 1)
			curr++;
		else
			curr = 0;
		res = (res < curr) ? curr : res;
	}
	return res;
}


//Problem is available on leetcode