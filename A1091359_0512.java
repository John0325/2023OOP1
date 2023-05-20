import java.util.Random;
import java.util.Scanner;

class DumplingShopSimulator {
    private static final int TARGET_PORK_DUMPLINGS = 5000;
    private static final int TARGET_BEEF_DUMPLINGS = 3000;
    private static final int TARGET_VEGETABLE_DUMPLINGS = 1000;
    private static final int MIN_ORDER_QUANTITY = 10;
    private static final int MAX_ORDER_QUANTITY = 50;

    private static int porkDumplingsCount = TARGET_PORK_DUMPLINGS;
    private static int beefDumplingsCount = TARGET_BEEF_DUMPLINGS;
    private static int vegetableDumplingsCount = TARGET_VEGETABLE_DUMPLINGS;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入同時光顧的顧客數目：");
        int customerCount = scanner.nextInt();
 

        for (int i = 0; i < customerCount; i++) {
            new Thread(new Customer(i + 1)).start();
        }
    }

    static class Customer implements Runnable {
        private int customerId;
        private Random random;

        public Customer(int customerId) {
            this.customerId = customerId;
            this.random = new Random();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000); // 等待服務生的時間

                int orderQuantity = random.nextInt(MAX_ORDER_QUANTITY - MIN_ORDER_QUANTITY + 1) + MIN_ORDER_QUANTITY;
                String dumplingType = getRandomDumplingType();

                System.out.println("顧客 " + customerId + " 點了 " + orderQuantity + " 個 " + dumplingType);

                synchronized (DumplingShopSimulator.class) {
                    if (dumplingType.equals("豬肉水餃")) {
                        if (orderQuantity <= porkDumplingsCount) {
                            porkDumplingsCount -= orderQuantity;
                            System.out.println("顧客 " + customerId + " 的訂單已完成");
                        } else {
                            System.out.println("顧客 " + customerId + " 的訂單無法完成，豬肉水餃已賣完");
                        }
                    } else if (dumplingType.equals("牛肉水餃")) {
                        if (orderQuantity <= beefDumplingsCount) {
                            beefDumplingsCount -= orderQuantity;
                            System.out.println("顧客 " + customerId + " 的訂單已完成");
                        } else {
                            System.out.println("顧客 " + customerId + " 的訂單無法完成，牛肉水餃已賣完");
                        }
                    } else if (dumplingType.equals("蔬菜水餃")) {
                        if (orderQuantity <= vegetableDumplingsCount) {
                            vegetableDumplingsCount -= orderQuantity;
                            System.out.println("顧客 " + customerId + " 的訂單已完成");
                        } else {
                            System.out.println("顧客 " + customerId + " 的訂單無法完成，蔬菜水餃已賣完");
                        }
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getRandomDumplingType() {
        Random random = new Random();
        int dumplingType = random.nextInt(3);
        switch (dumplingType) {
            case 0:
                return "豬肉水餃";
            case 1:
                return "牛肉水餃";
            case 2:
                return "蔬菜水餃";
            default:
                return "錯誤";
        }
    }
}




       

