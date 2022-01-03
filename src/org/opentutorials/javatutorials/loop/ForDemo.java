package org.opentutorials.javatutorials.loop;

public class ForDemo {

    public static void main(String[] args) {

        // for ( 변수 초기화; 반복문의 종료조건; 반복문이 실행될때마다 실행 )
        for (int i=0; i<10; i++) {
            // 위 내용 중간의 i<10 이라는 조건이 true 가 되면, 아래의 문장이 실행되어서 출력됨.
            System.out.println("Coding Everybody " + i);
            // 그리고 위 문장까지 출력이 되면, i++ 가 실행되기로 약속이 되어있어서 i++ 해주면 반복할때마다 1씩 더해짐.

        }

    }

}
