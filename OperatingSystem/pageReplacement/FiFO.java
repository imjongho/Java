package pageReplacement;
import java.util.Queue;
import java.util.LinkedList;

public class FiFO {

    public static void main(String[] args) {
        Queue<Integer> pageFrames = new LinkedList<>();
        int frameSize = 3; // 페이지 프레임 3개 할당
        // 페이지 1~8
        int[] pageRequests = {0, 1, 2, 3, 0, 1, 4, 0, 1, 2, 3, 4}; // 페이지 호출 순서
        int hit = 0, fault = 0, replacement = 0;

        // 페이지 호출 순서대로 하나씩 진행
        for (int page : pageRequests) {
        	// pageFrames에 호출한 패이지가 있으면 hit
            if (pageFrames.contains(page)) {
            	hit++;
            } else {	// 없으면 fault
                fault++;
                if (pageFrames.size() == frameSize) {	// 페이지 프레임이 꽉찬 상태이면
                	pageFrames.poll(); // 가장 오래된 페이지 제거, 가장 먼저 들어온 놈 나가
                    replacement++;
                }
                pageFrames.add(page); // 새 페이지 추가
            }
        }

        System.out.println("Page Hit: " + hit);
        System.out.println("Page Fault: " + fault);
        System.out.println("Page Replacement: " + replacement);
    }

}
