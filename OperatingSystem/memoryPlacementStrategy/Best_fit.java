package memoryPlacementStrategy;
import java.util.LinkedList;
import java.util.Collections;

public class Best_fit {

    public static void main(String[] args) {
        LinkedList<Integer> freeStorageList = new LinkedList<>();
        // 초기값: 오름차순으로 정렬된 빈 기억장치 리스트
        freeStorageList.add(7);
        freeStorageList.add(15);
        freeStorageList.add(17);
        freeStorageList.add(30);

        int processSizes = 12; 	// 요청 메모리 크기

        for (int i = 0; i < freeStorageList.size(); i++) {
            if (freeStorageList.get(i) >= processSizes) {
            	freeStorageList.set(i, freeStorageList.get(i) - processSizes);	// 남은 크기
                System.out.println(freeStorageList.get(i) + "K");
                break;
            }
        }
        Collections.sort(freeStorageList); // 다시 오른차순 정렬

    }

}
