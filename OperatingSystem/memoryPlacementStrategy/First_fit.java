package memoryPlacementStrategy;
import java.util.LinkedList;

// 기억장치 배치 기법 
public class First_fit {
	
    public static void main(String[] args) {
        LinkedList<Integer> freeStorageList = new LinkedList<>();
        // 빈 기억장치 리스트
        freeStorageList.add(17);	// 시작주소 'a' 길이 17K
        freeStorageList.add(7);
        freeStorageList.add(15);
        freeStorageList.add(50);

        int processSizes = 12; 	// 요청 메모리 크기

        for (int i = 0; i < freeStorageList.size(); i++) {
            if (freeStorageList.get(i) >= processSizes) {
            	freeStorageList.set(i, freeStorageList.get(i) - processSizes);
                System.out.println(freeStorageList.get(i) + "K");
                break;
            }
        }
    }

}
