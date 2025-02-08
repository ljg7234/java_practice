package practice;

public class PlatformThreadExample {
    public static void main(String[] args) {
        Thread platformThread1 = new Thread(()-> {
            System.out.println("platformThr1실행");
        });
        platformThread1.start();
        Thread.ofPlatform()
                .start(()-> {
                    System.out.println("platform2 실행");
                });
        Thread.ofPlatform()
                .name("copyThread")
                .start(()-> {
                    System.out.println("platform3 실행");
                });
        Thread platformThread4 = Thread.ofPlatform()
                .name("downloadThread")
                .daemon()
                .start(()-> {
                    System.out.println("patform4 실행");
                });
        System.out.println("platform4 이름: "+ platformThread4.getName());
    }
}
