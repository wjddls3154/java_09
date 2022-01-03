package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.println(i + "" +j);
            }
        }
        /**
         * 반복문 안의 반복문 위에걸 실행하면 처음에 00 이나오고, 그 다음에 안의 반복문만 계속 실행이 되서 j값만 올라간다 09까지.
         * 그리고 j가 9 다음 10이 되면 반복문이 종료 되어서, 다시 바깥의 반복문이 실행되어서 i가 1이되고 j는 다시 0으로 초기화 되어 10이 된다.
         * 그러고 i가 1인 상태에서 다시 j는 9까지 반복하고 다음 10이 되면 반복문이 종료되어 다시 바깥의 반복문이 실행되어 i가 2가되고 j는 다시 0으로 초기화 되어 20이 된다.
         * 이렇게 마지막까지 반복하다보면 결국, 99까지 출력이된다.
         */

    }

}
