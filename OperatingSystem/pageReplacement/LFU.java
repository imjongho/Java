package pageReplacement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LFU {

    public static void main(String[] args) {
        int frameSize = 3;
        int[] pageRequests = {8, 1, 2, 3, 1, 4, 1, 5, 3, 4, 1, 4, 3, 2, 3, 1, 2, 8, 1, 2};
        int hit = 0, fault = 0, replacement = 0;

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();	// 각 페이지의 빈도수를 추적
        Queue<Integer> pageFrames = new LinkedList<>();		// 페이지 프레임을 저장하는 큐

        for (int page : pageRequests) {
        	// pageFrames에 호출한 패이지가 있나?
            if (pageFrames.contains(page)) {
                hit++;	// 있으면 페이지 hit
                frequencyMap.put(page, frequencyMap.get(page) + 1);	// 해당 페이지의 빈도수 증가
            } else {
                fault++;	// 없으면 페이지 fault
                if (pageFrames.size() == frameSize) {
                    int minFreq = Integer.MAX_VALUE;
                    int lfuPage = -1;

                    for (int p : pageFrames) {
                        int freq = frequencyMap.get(p);
                        if (freq < minFreq || (freq == minFreq && p == pageFrames.peek())) {
                            minFreq = freq;
                            lfuPage = p;	// 가장 적게 사용된 페이지 찾기
                        }
                    }

                    pageFrames.remove(lfuPage);		// 가장 적게 사용된 페이지 제거
                    replacement++;
                }
                
                pageFrames.offer(page);		// 페이지 추가
                frequencyMap.put(page, 1);	// 페이지 빈도수를 1로 설정
                // System.out.println(pageFrames);
            }

        }

        System.out.println("Page Hit: " + hit);
        System.out.println("Page Fault: " + fault);
        System.out.println("Page Replacement: " + replacement);
    }

   
}
