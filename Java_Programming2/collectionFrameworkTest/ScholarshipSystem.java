package collectionFrameworkTest;
import java.util.*;

public class ScholarshipSystem {
	
	public static void main(String[] args) {
		HashMap<String, Double> scoreMap = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("미래장학관이시스템입니다.");
		for(int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String name = sc.next();

			double score = sc.nextDouble();
			scoreMap.put(name, score);	
		}
		System.out.println(scoreMap);
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double cutLine = sc.nextDouble();	

        System.out.print("장학생 명단 : ");
        Set<String> nameSet = scoreMap.keySet();
        Iterator<String> it = nameSet.iterator();
        while(it.hasNext()) {
        	String name = it.next();
        	double score = scoreMap.get(name);
        	if(score > cutLine) {
        		System.out.print(name + " ");
        	}
        }
        
        /*
        boolean found = false;
        for (Map.Entry<String, Double> entry : scoreMap.entrySet()) {
            if (entry.getValue() >= cutLine) {
                System.out.println(entry.getKey() + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 기준에 맞는 장학생이 없습니다.");
        }
		*/
        
		sc.close();

	}

}
