package Programmers;

import java.util.*;

/**
 * packageName    : Programmers
 * fileName       : lessons42579
 * author         : Sora
 * date           : 2024-07-02
 * description    : 베스트앨범
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-02        Sora       최초 생성
 */
public class lessons42579 {
    public static void main(String[] args) {
      int[] result = solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
      for(int i : result){
          System.out.print(i+", ");
      }
    }
    static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, List<int[]>> music = new HashMap<>();
        Map<String,Integer> totalPlay = new HashMap<>();

        // Put data into map.
        for(int i = 0; i < plays.length; i++){
            List<int[]> arr = music.get(genres[i]);
            if(arr == null) arr = new ArrayList<>();
            arr.add(new int[]{i, plays[i]});
            music.put(genres[i],arr);

            if(totalPlay.get(genres[i]) == null){
                totalPlay.put(genres[i], plays[i]);
            }else{
                totalPlay.put(genres[i], totalPlay.get(genres[i])+plays[i]);
            }

        }

        // Sort and push
        Map<String,Integer> sortedTotalPlay = sortTotalPlay(totalPlay);
        List<Integer> result = new ArrayList<>();

        for(String genre : sortedTotalPlay.keySet()){
            List<int[]> entry = music.get(genre);
            entry.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2){
                    if(o1[1] > o2[1]) return -1;
                    else if(o1[1] < o2[1]) return 1;
                    else{
                        return Integer.compare(o1[0],o2[0]);
                    }
                }
            });
            result.add(entry.get(0)[0]);
            if(entry.size()>1){
                result.add(entry.get(1)[0]);
            }
        }

        // Re-type
        answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static LinkedHashMap<String,Integer> sortTotalPlay(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> entry = new LinkedList<>(map.entrySet());
        LinkedHashMap<String,Integer> result = new LinkedHashMap<>();

        // "-" is for descending order
        entry.sort((o1,o2) -> o2.getValue().compareTo(o1.getValue()));

        for(Map.Entry<String,Integer> iter : entry){
            result.put(iter.getKey(), iter.getValue());
        }
        return result;
    }


}
