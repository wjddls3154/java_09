package org.opentutorials.javatutorials.loop;

public class ContinueDemo {
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {

            if (i == 5) {
                continue;    // 이처럼 한줄짜리 구문이면 중괄호 생략가능, 하지만 한줄 이상일 경우에는 반드시 써줘야함.
                // 조건이 충족(i=5) 되는 continue 를 만나면, 여기서 중단이 되서 아래 구문이 출력되지않는다.
                // 허나, break 와 다르게 반복문이 종료되는게 아닌, 그 다음 반복으로 넘어가, 다시 실행이 된다.
            }
            System.out.println("Coding Everybody " + i );
        }

    }
}
