package CH19;

import java.util.*;


public class C03Ex {
    public static void main(String[] args) {
        //1~45 까지 숫자를 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장
        //저장된 set의 오름차순 정렬을 해보세요
        Set<Integer> set = new HashSet();
        Random random = new Random();
        while (true) {
            int rannum = random.nextInt(45) + 1;
            set.add(rannum);
            if (set.size() == 6) {
                break;
            }
        }
            Iterator<Integer> num = set.iterator();
            while (num.hasNext()){
                int number = num.next();
//                System.out.print(number+" ");
            }
            List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i+" ");
        }

    }
    }
