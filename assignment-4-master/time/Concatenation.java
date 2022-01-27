package mr223_assign4.time;


import java.util.Date;

public class Concatenation {
    public static void main(String[] args) {
        long time = new Date().getTime();
        String word = "x";
        int t1 = 0;
        int t2= 0;
        int t3 = 0;
        int t4 = 0;

        while (new Date().getTime()-time<1000) {
            word = word + 'z';
            t1++;
        }
        System.out.println( "Short string concatenations using + operator: "+ t1+"\n"+
                "Length: "+ word.length()+"\n=====");

        String word2 = "O";

        System.gc();
        long time2 = new Date().getTime();
        while (new Date().getTime()-time2<1000) {
            word2 = word2 + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            t2++;
        }

        System.out.println("Long string concatenations using + operator: "+ t2+"\n"
                + "Length: " + word2.length()+"\n=====");


        StringBuilder st = new StringBuilder();
        st.append("R");

        System.gc();
        long time3 = new Date().getTime();
        while (new Date().getTime()-time3<1000) {
            st.append("Q");
            t3++;
        }

        String str = st.toString();
        System.out.println("Short string appending using StringBuilder: "+ t3+"\n"+
                "Length: "+ str.length()+"\n=====");
        st.delete(0, st.length());

        System.gc();
        long time4 = new Date().getTime();
        st.append("c");
        while (new Date().getTime()-time4<1000) {
            st.append("hrddiysbuxunzdyoncjtystgcihfwngonyibznfvupmdyupxjdohajnufigduzckfcqztcxcbveyrbgfclltddxbavnnxqkxgqxecshvdrkfqytiuqeutvrgcr");
            t4++;
        }
        System.out.println("Long string appending using StingBuilder: "+ t4 +"\n"+
                "Length: "+ st.length());





    }

}