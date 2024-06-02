package memoryPlacementStrategy;
import java.util.LinkedList;
import java.util.Collections;

public class Worst_fit {

    public static void main(String[] args) {
        LinkedList<Integer> freeStorageList = new LinkedList<>();
        // 초기값: 내림차순으로 정렬된 빈 기억장치 리스트
        freeStorageList.add(50);
        freeStorageList.add(17);
        freeStorageList.add(15);
        freeStorageList.add(7);

        int processSizes = 12; 	// 요청 메모리 크기

        for (int i = 0; i < freeStorageList.size(); i++) {
            if (freeStorageList.get(i) >= processSizes) {
            	freeStorageList.set(i, freeStorageList.get(i) - processSizes);
                System.out.println(freeStorageList.get(i) + "K");
                break;
            }
        }
        Collections.sort(freeStorageList); // 먼저 오름차순으로 정렬
        Collections.reverse(freeStorageList); // 그 다음 순서를 뒤집어 내림차순으로 만듬
   
    }
    
}
