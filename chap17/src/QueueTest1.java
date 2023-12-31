import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueTest1 {
    public static void main(String[] args) {
        LinkedList<String> queue=new LinkedList<String>();
        //사용자로부터 4개의 과일 이름을 입력받아 queue 저장 -> offer()
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("과일 이름을 입력하세요 :");
            String fruits=scan.next();
            queue.offer(fruits);
        }

        //queue에 저장된 과일 리스트 출력
        System.out.println("과일 리스트<큐> : "+queue);

        //queue에서 과일 찾기 - indextOf
        System.out.println("찾고 싶은 과일 이름을 입력하세요 :");
        String f_name=scan.next();
        int fruit=queue.indexOf(f_name);
        if(fruit!=-1){
            System.out.println("큐에서 "+f_name+"의 위치는"+fruit+"번쨰입니다.");
        }
        else {
            System.out.println("큐에서 "+f_name+"가 없습니다.");
        }
        System.out.println("과일 리스트<큐> 삭제");
        //queue 리스트의 과일 삭제 - poll()
        while (!queue.isEmpty()){
            String obj=queue.poll();
            System.out.println("<큐>에서 poll : "+obj);
        }
    }
}
