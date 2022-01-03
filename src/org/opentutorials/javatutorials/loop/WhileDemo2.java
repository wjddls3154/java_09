package org.opentutorials.javatutorials.loop;

public class WhileDemo2 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
        // i의 값이 10보다 작다면 true, 크다면 false 가 되는 조건. 현재 i의 값은 0이다.
        // 조건이 true 라면 while 문 뒤의 중괄호 내용이 실행이 되고, false 라면 while 문이 끝난 뒤 부터 실행된다.

            System.out.println("Coding Everybody" + i);
            // 조건이 true 일 경우 출력된다.
            i++;
            // i의 값에 1을 더한다. 이걸 더하고 나면 다시 위의 반복문으로 돌아가서 조건을 검사 후 실행됨.

        }

    }

}
