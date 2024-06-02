package Search;

// 보간 탐색 : 키 값들의 차가 균일한 분포를 이룰 경우에 탐색이 빠르기 때문에 사용
public class InterpolationSearch {
	
	public static int interpolationSearch(int arr[], int length, int target) {
		
		// 배열이 정렬되어 있는 상태이기에 index 0이 최소값,  index 10이 최대값 
		int minIndex = 0;
		int maxIndex = length - 1;
		int targetIndex;		// 키 값이 있을 법한 위치(탐색 위치)
		
		while(arr[minIndex] <= target && arr[maxIndex] >= target) {
			int n = maxIndex - minIndex;
			//System.out.println(n);
			targetIndex = (int)Math.round((double)(target - arr[minIndex]) / (arr[maxIndex] - arr[minIndex]) * n);
			//System.out.println(targetIndex);
			
			if(arr[targetIndex] == target) {
				return targetIndex;
			}
			else if(arr[targetIndex] < target) {
				minIndex = targetIndex + 1;	// 이미 탐색한 위치는 제외하기 위함 +-1
			}
			else {
				maxIndex = targetIndex - 1;
			}
			// target이 아니라면 서브파일로 만들고 다시 탐색
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		// 배열의 크기 11개
		int[] arr = { 20, 25, 35, 43, 48, 56, 60, 69, 72, 75, 78 };
		
		// 배열: 입력 파일, 길이: 레코드의 개수, 타깃: 찾고자 하는 값(key값)
		System.out.println(interpolationSearch(arr, 11, 72));
		
		
	}

}
