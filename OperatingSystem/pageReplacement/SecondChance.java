package pageReplacement;
import java.util.LinkedList;
import java.util.Queue;

public class SecondChance {

    public static void main(String[] args) {
        int frameSize = 3;	// 페이지 프레임이 3개일 때
        int[] pageRequests = {8, 1, 2, 3, 1, 4, 1, 5, 3, 4, 1, 4, 3, 2, 3, 1, 2, 8, 1, 2};	// 페이지 호출 순서
        int hit = 0, fault = 0, replacement = 0;

        Queue<Integer> pageFrames = new LinkedList<>();	// 원형 큐 사용
        boolean[] referenceBits = new boolean[frameSize]; // 참조 비트 배열
        int pointer = 0; // 원형 큐에서 검색을 시작하는 프레임 위치를 포인터라고 부름

        // 초기화
        for(int i = 0; i < frameSize; i++) {
        	referenceBits[i] = false;
        }
        
        for (int page : pageRequests) {
        	// pageFrames에 호출한 패이지가 있나?
            if (pageFrames.contains(page)) {
                hit++;	// 있으면 페이지 hit
                // System.out.println("hit " + page);
                int index = ((LinkedList<Integer>) pageFrames).indexOf(page);
                referenceBits[index] = true; // 해당 페이지의 참조 비트를 1로 설정
            } else {
            	fault++;	// 없으면 페이지 fault
                while (true) {
                    if (referenceBits[pointer]) {
                    	// 참조 비트가 1인 경우, 0으로 바꾸고 다음 프레임으로 이동
                        referenceBits[pointer] = false; // 참조 비트를 0으로 설정
                        pointer = (pointer + 1) % frameSize; // 다음 위치로 이동 (원형 큐)
                    } else {
                        // 참조 비트가 0인 페이지를 희생 프레임으로 선택하고 루프 종료
                    	if (pageFrames.size() == frameSize) {	// 페이지 프레임이 꽉찬 상태이면 교체
                            // 페이지 프레임이 가득 찼다면, 포인터 위치의 페이지를 제거
                            ((LinkedList<Integer>)pageFrames).remove(pointer);
                            replacement++;
                        }
                        
                    	// System.out.println("fault " + page);
                        ((LinkedList<Integer>)pageFrames).add(pointer, page);	// 페이지를 포인터 위치에 삽입
                        referenceBits[pointer] = true; // 참조 비트를 1로 설정
                        pointer = (pointer + 1) % frameSize;
                        break;
                    }
                }
            }
        }

        System.out.println("Page Hit: " + hit);
        System.out.println("Page Fault: " + fault);
        System.out.println("Page Replacement: " + replacement);
    }

}




