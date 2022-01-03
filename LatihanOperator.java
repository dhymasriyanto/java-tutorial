/**
 * LatihanOperator
 */
public class LatihanOperator {

    public static void main(String[] args) {
           
        // Operator Aritmatika
            int a = 3 + 2;
            int b = 3 - 2;
            int c = 4 * 2;
            int d = 5 / 2;

            int e = 5 % 3; // mod / modulus

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            //Operator increament dan Decreament
         
            int f = 4;
            int g = f++;
            int j = g;
            int k = f;

            int h = 4;
            int i = ++h;
            int l = i;

            int m = 4; // m = 4
            int n = m--; // n= 4 m=3

            int o = --m; //m =2

            int p = ++m;

            System.out.println("G = " + g);
            System.out.println("I = " + i);
            System.out.println("J = " + j);
            System.out.println("K = " + k);
            System.out.println("L = " + l);
            System.out.println("N = " + n);
            System.out.println("O = " + o);
            System.out.println("P = " + p);





        // Operator Relasional 
           
            // < > == != <= >= 
            boolean q = 2 < 2;
            boolean r = 2 > 1;
            boolean s = 2 == 3;
            boolean t = 2 != 2;
            boolean u = 2 <= 2;
            boolean v = 2 >=2 ;


            System.out.println("Q = " + q);
            System.out.println("R = " + r);
            System.out.println("S = " + s);
            System.out.println("T = " + t);
            System.out.println("U = " + u);
            System.out.println("V = " + v);

        // Operator Logika
        //  AND , OR , XOR , NOT
        // && , || , ^ , !

        // and
        // hanya akan bernilai true jika kedua operand nya true
        // true && true = true
        // true && false = false
        // false  && true = false
        // false && false = false

        boolean w = true && true;
        System.out.println("W = " + w);

        boolean x = (2 < 3) && (3>2);
        //true && true = true
        System.out.println("X = " + x);

        // or
        // hanya akan bernilai false jika kedua operandnya false
        // true || false = true
        // false || true = true
        // true || true = true
        // false || false = false

        boolean y = (4==4) || !(1<3);
        // true || false 

        System.out.println("Y =" + y);

 
        // XOR = exclusive or
        // akan bernilai false ketika keduanya memiliki operand yang sama
        // true  ^ true = false
        // true ^ false = true 
        // false ^ true = true
        // false ^ false = false

            boolean z = (3 >= 4) ^ (4<4);
            System.out.println("Z = " + z);
        // not
        // !true = false
        // !false = true


        //XNOR exclusive not or
        // akan bernilai true ketika keduanya memiliki operand yang sama
        // !(true ^ true) = true
        // !(false ^ false) = true
        // !(true ^ false) = false

    }
}


