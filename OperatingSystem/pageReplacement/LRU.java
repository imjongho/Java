package pageReplacement;
import java.util.Deque;
import java.util.LinkedList;

public class LRU {

    public static void main(String[] args) {
        Deque<Integer> pageFrames = new LinkedList<>();	// 3개의 페이지 프레임(물리 공간)을 저장하는 데큐, 페이지는 8개 존재(1~8)
        int frameSize = 3;	// 페이지 프레임이 3개일 때
        int[] pageRequests = {8, 1, 2, 3, 1, 4, 1, 5, 3, 4, 1, 4, 3, 2, 3, 1, 2, 8, 1, 2};	// 페이지 호출 순서
        int hit = 0, fault = 0, replacement = 0;

        // 페이지 호출 순서대로 하나씩 진행
        for (int page : pageRequests) {
        	// pageFrames에 호출한 패이지가 있나?
            if (pageFrames.contains(page)) {
            	hit++;	// 있으면 페이지 hit
            	pageFrames.removeFirstOccurrence(page);	// 페이지를 맨 위로 이동시키기 위해 제거
            } else {
            	fault++;	// 없으면 페이지 fault
                if (pageFrames.size() == frameSize) {
                	pageFrames.removeLast(); // 가장 오래전에 사용된 페이지 제거
                	replacement++;	// 페이지 교체 수 증가
                }
            }
            
            pageFrames.addFirst(page); // 페이지를 맨 위에 추가(가장 최근에 사용됨)
        }
        
        System.out.println("Page Hit: " + hit);
        System.out.println("Page Fault: " + fault);
        System.out.println("Page Replacement: " + replacement);
    }

}
