package top.guoziyang.mydb.backend.utils;

public class Types {
    //用页号和偏移量生成uid
    public static long addressToUid(int pgno, short offset) {
        long u0 = (long)pgno;
        long u1 = (long)offset;
        return u0 << 32 | u1;
    }
}
