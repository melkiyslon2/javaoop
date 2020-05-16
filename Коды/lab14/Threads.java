import java.util.concurrent.Callable;

public class Threads {

    public static class MyThread3 implements Callable<Boolean> {
        public static final int HIGHER_PAYMENT = 3000;
        linkedContainer<SecondCreate> linkedContainer;

        @Override
        public Boolean call() throws Exception {
            countHigherPayment();
            return true;
        }

        private void countHigherPayment() throws InterruptedException {
            int count = 0;
            for (int i = 0; i < linkedContainer.size(); i++) {
                Thread.sleep(0);
                if (linkedContainer.getElementByIndex(i).getPayment() > HIGHER_PAYMENT) {
                    count++;
                }
            }
            //System.out.println("Number of vacancies with higher payment: " + count);
        }

        public void set(linkedContainer<SecondCreate> linkedContainer) {
            this.linkedContainer = linkedContainer;
        }
    }

    public static class MyThread2 implements Callable<Boolean> {
        linkedContainer<SecondCreate> linkedContainer;


        private void sumAvgPayment() throws InterruptedException {
            long sum = 0;
            long avg = 0;
            for (int i = 0; i < linkedContainer.size(); i++) {
                 Thread.sleep(0);
                sum += linkedContainer.getElementByIndex(i).getPayment();
            }
            avg = sum / linkedContainer.size();
            System.out.println("Sum payment = " + sum);
            System.out.println("Avg payment = " + avg);
        }

        public void set(linkedContainer<SecondCreate> linkedContainer) {
            this.linkedContainer = linkedContainer;
        }

        @Override
        public Boolean call() throws Exception {
            sumAvgPayment();
            return true;
        }
    }


    public static class MyTread1 implements Callable<Boolean> {

        linkedContainer<SecondCreate> linkedContainer;

        public void set(linkedContainer<SecondCreate> linkedContainer) {
            this.linkedContainer = linkedContainer;
            //System.out.println(linkedContainer.size());
        }

        @Override
        public Boolean call() throws Exception {
            run();
            return true;
        }


        public void run() throws InterruptedException {

            int max = linkedContainer.getElementByIndex(0).getPayment();
            int min = linkedContainer.getElementByIndex(0).getPayment();
            for (int i = 0; i < linkedContainer.size(); i++) {
                Thread.sleep(0);
                if (linkedContainer.getElementByIndex(i).getPayment() < min) {
                    min = linkedContainer.getElementByIndex(i).getPayment();
                }
                if (linkedContainer.getElementByIndex(i).getPayment() > max) {
                    max = linkedContainer.getElementByIndex(i).getPayment();
                }
            }
            System.out.println("Max payment = " + max + "$");
            System.out.println("Min payment = " + min + "$");
        }




    }


  /*  linkedContainer<SecondCreate> linkedContainer;

   public Threads(linkedContainer<SecondCreate> linkedContainer)
   {
       this.linkedContainer = linkedContainer;
   }


    @Override
    public void run() {

        int max = linkedContainer.getElementByIndex(0).getPayment();
        int min = linkedContainer.getElementByIndex(0).getPayment();
        for (int i = 0; i < linkedContainer.size(); i++) {
            if (linkedContainer.getElementByIndex(i).getPayment() < min) {
                min = linkedContainer.getElementByIndex(i).getPayment();
            }
            if (linkedContainer.getElementByIndex(i).getPayment() > max) {
                max = linkedContainer.getElementByIndex(i).getPayment();
            }
        }
        System.out.println("Max payment = " + max+"$");
        System.out.println("Min payment = " + min+"$");
    }*/

}
