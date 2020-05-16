public class SecondThead  {

    linkedContainer<SecondCreate> linkedContainer;

    public SecondThead(linkedContainer<SecondCreate> linkedContainer)
    {
        this.linkedContainer = linkedContainer;
    }



    public void run() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < linkedContainer.size(); i++) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum += linkedContainer.getElementByIndex(i).getPayment();
        }
        avg = sum / linkedContainer.size();
        System.out.println("Sum payment = " + sum);
        System.out.println("Avg payment = " + avg);
    }

}