public class Day3 {
    public static void main(String[] args) {
        int i=1;
        int j = i++ + i++;
        long l = i;
        i = (int) l;
        System.out.println(i);
        i = (int) 2.5;
        System.out.println(i);
        byte b= (byte) 127;
        // short is coded on 16 bits
        // It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        System.out.println(b);
    }
}
