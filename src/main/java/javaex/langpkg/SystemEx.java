package javaex.langpkg;

public class SystemEx {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Timing a for loop from 0 to 100,000,000");
        // time a for loop from 0 to 100,000,000
//        start = System.currentTimeMillis();
//        System.out.println(start);// get starting time
//        for(long i=0; i < 10000000000L; i++) ;
//        end = System.currentTimeMillis(); // get ending time
//        System.out.println("Elapsed time: " + ((double) (end-start)/1000));

        // korishimiz mumkin ki shusongacha sanash pochti 3 sekund ovoti bu faqat manda

        byte[] source = {65, 66, 67, 68, 69, 70};
        byte[] target = {71, 72, 73, 74, 75, 76};
        System.arraycopy(source, 0, target, 0, target.length);
        System.out.println(new String(target));

        System.out.println(System.getenv("DAVRON"));
        System.out.println(System.getProperty("user.dir"));


    }
}
