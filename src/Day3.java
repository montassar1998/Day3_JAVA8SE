
public class Day3 {

    interface Operation {
        int calc(int x, int y);
    }

    private static int calculer(int x, int y, Operation op) {
        return op.calc(x, y);
    }
    public static void main(String[] args) {
        int i=1;
        int j = i++ + i++;
        long l = i;
        i = (int) l;
        //System.out.println(i);
        i = (int) 2.5;
        //System.out.println(i);
        byte b= (byte) 127;
        // short is coded on 16 bits
        // It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
        int x= 3;
        int y=++x*5/x--+--x;
        //System.out.println(y);
        //avec la déclaration de type
        Operation addition = Integer::sum;

        //sans déclaration de type
        Operation soustraction = (int param1, int param2) -> param1 - param2;

        //avec 'return' et les accolades
        Operation multiplication = (int param1, int param2) -> { return param1 * param2; };

        //sans 'return' et sans les accolades
        Operation division = (int param1, int param2 ) -> param1 / param2;

        System.out.println("8 + 2 = " + calculer(8, 2, addition));
        System.out.println("8 - 2 = " + calculer(8, 2, soustraction));
        System.out.println("8 x 2 = " + calculer(8, 2, multiplication));
        System.out.println("8 / 2 = " + calculer(8, 2, division));

        //control structures and loops
        int hour = 10;


        if(hour<11){
            System.out.println("Good morning");
        }else{

        }

    }
}
