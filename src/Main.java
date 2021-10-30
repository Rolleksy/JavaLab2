public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        String tekst1 = "tekst 1";
        String tekst2 = "tekst 2";
        String tekst3 = "tekst 3";
        for (int i = 0; i<10; i++){
            switch(i){
                case 0:
                    System.out.println(tekst1);
                    continue;
                case 1:
                    System.out.println(tekst2);
                    break;
            }
        }

    }
}
