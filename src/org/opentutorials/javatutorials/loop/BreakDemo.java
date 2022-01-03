package org.opentutorials.javatutorials.loop;

public class BreakDemo {

    public static void main(String[] args) {

     for(int i=0; i<10; i++) {

        if (i == 5) {
            break;    // 이처럼 한줄짜리 구문이면 중괄호 생략가능, 하지만 한줄 이상일 경우에는 반드시 써줘야함.
            // for 문의 조건과 상관없이, 조건이 충족(i가 5가) 되면 반복문을 종료시키는 구문이 break 문
        }
        System.out.println("Coding Everybody " + i );
     }

    }

}
