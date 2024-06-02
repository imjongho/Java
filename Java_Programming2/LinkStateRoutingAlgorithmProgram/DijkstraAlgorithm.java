package LinkStateRoutingAlgorithmProgram;
import java.util.Scanner;

class Dijkstra {

	int INF = 9999;		// 무한대 표시
	int nodeCnt = 7;	// 노드의 개수
	int rootNode;		// 시작 노드
	
	int startTable[][] = { 
			{0, 2, INF, 3, INF, INF, INF},		// A Cost
			{2, 0, 5, INF, 4, INF, INF},		// B
			{INF, 5, 0, INF, INF, 4, 3},		// C
			{3, INF, INF, 0, 5, INF, INF},		// D
			{INF, 4, INF, 5, 0, 2, INF},		// E
			{INF, INF, 4, INF, 2, 0, 1},		// F
			{INF, INF, 3, INF, INF, 1, 0} };	// G
	
	// 업데이트되는 Cost값을 저장하기 위한 배열
	int updateTable[] = new int[nodeCnt];
	// 업데이트되는 경로의 노드를 저장
	String nextHop[] = new String[nodeCnt];
	// 방문한 노드(확정 노드)
	boolean sureVisited[] = new boolean[nodeCnt];
	// 확정 노드와 인접한 임의 노드
	boolean pickVisited[] = new boolean[nodeCnt];
	// 루트 노드와 인접한 임의 노드
	String[] pickNode = new String[nodeCnt];
	
	public Dijkstra(String root) {
		
		// 초기화
		for(int i = 0; i < nodeCnt; i++) {
			updateTable[i] = INF;
			sureVisited[i] = false;
			pickVisited[i] = false;
			nextHop[i] = "";
			pickNode[i] = "";
		}
		
		rootNode = getNodeInt(root);
		
		// 처음 시작 세팅
		int cnt = 0;
		sureVisited[rootNode] = true;	// 루트 노드 방문 확정
		for(int i = 0; i < nodeCnt; i++) {
			updateTable[i] = startTable[rootNode][i];	// 루트 노드의 가중치 옮기기
	
			if(startTable[rootNode][i] < INF) {
				pickVisited[i] = true;	// 루트 노드의 인접 노드 체크
				pickNode[cnt++] = getNodeName(i);	// 루트 노드의 인접 노드 저장(루트 노드 포함)
				nextHop[i] = getNodeName(i);
			}
			nextHop[rootNode] = "-";
		}
		
		
		// 루트노드를 제외한 나머지 노드 수 만큼 반복
		for(int i = 0; i < nodeCnt - 1; i++) {
			int minNode = getMinNode();		// 호출
			sureVisited[minNode] = true;
			
			// 확정 노드의 인접 노드 확인
			for(int j = 0; j < nodeCnt; j++) {
				if(startTable[minNode][j] < INF) {
					pickVisited[j] = true;
				}
			}
			
			// 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우 업데이트
			for(int j = 0; j < nodeCnt; j++) {
				if((sureVisited[j] == false) && (pickVisited[j] == true)) {
					int cost = updateTable[minNode] + startTable[minNode][j];
					if(cost < updateTable[j]) {
						updateTable[j] = cost;
						nextHop[j] = getNodeName(minNode);
					}
				}
			}
			
		}
		
		
		for(int i = 0; i < nodeCnt; i++) {
			
			if(nextHop[i].equals("-")) {
				continue;
			}
			
			boolean check = false;
			while(true) {
				for(String s : pickNode) {
					if(nextHop[i].equals(s)) {
						check = true;
					}
				}
				
				if(check == true) {
					break;
				}
				
				int temp = getNodeInt(nextHop[i]);
				nextHop[i] = nextHop[temp];
			}
			
		}
		
		// 결과 출력
		System.out.print("Dest\tCost\tNextHop\n");
		for(int i = 0; i < nodeCnt; i++) {
			char c = (char)('A' + i);
			System.out.printf("%-4c\t", c);
			System.out.printf("%-4d\t", updateTable[i]);
			System.out.println(nextHop[i]);
		}
	}
	
	
	// updateTable 배열 안에서 가자 Cost 값이 작은 노드를 반환하는 함수
	public int getMinNode() {
		
		int minNode = 0;
		int minCost = INF;
		
		for(int i = 0; i < nodeCnt; i++) {
			if((updateTable[i] < minCost) && (sureVisited[i] != true) && (pickVisited[i] == true)) {
				minNode = i;
				minCost = updateTable[i];
			}
		}
		
		return minNode;
	}
	
	public String getNodeName(int index) {
		
		String s = "";
		switch(index) 
		{
		case 0:
			s = "A";
			break;
		case 1:
			s = "B";
			break;
		case 2:
			s = "C";
			break;
		case 3:
			s = "D";
			break;
		case 4:
			s = "E";
			break;
		case 5:
			s = "F";
			break;
		case 6:
			s = "G";
			break;
		}
		
		return s;
	}
	
	public int getNodeInt(String name) {
		
		int node = 0;
		switch(name) {
		case "A":
			node = 0;
			break;
		case "B":
			node = 1;
			break;
		case "C":
			node = 2;
			break;
		case "D":
			node = 3;
			break;
		case "E":
			node = 4;
			break;
		case "F":
			node = 5;
			break;
		case "G":
			node = 6;
			break;
		default:
			System.out.println("노드가 존재하지 않습니다");
			System.exit(0);
		}
		
		return node;
	}
	
}


public class DijkstraAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("라우팅 테이블 : ");
		String rootNode = sc.next();
		System.out.println(rootNode + "의 라우팅 테이블");
		
		new Dijkstra(rootNode);
		sc.close();
	}

}
