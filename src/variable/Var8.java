package variable;

public class Var8 {
    public static void main(String[] args) {
        /* 정수 default = int */
        byte b = 127; // -128 ~ +127 (2^8, 1byte)
        short s = 32767; // -32,768 ~ +32,767(2^16, 2byte)
        int i = 2147483647; // -2,147,483,648 ~ +2,147,483,647 (약 20억 = 2^32, 4byte)

        // -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 (2^64, 8byte)
        long l = 9223372036854775807L; // 대문자 'L' 사용권장

        /* 실수 default = double */
        float f = 10.0f; // 4byte
        double d = 10.0; // 더 큰 실수 범위, 8byte

        // boolean, char 1byte

        /* 자주 사용하는 타입
        * int, long
        * double
        * boolean
        * String */
    }
}
