public class SecondThead implements Runnable {

    linkedContainer<SecondCreate> linkedContainer;

    public SecondThead(linkedContainer<SecondCreate> linkedContainer)
    {
        this.linkedContainer = linkedContainer;
    }


    @Override
    public void run() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < linkedContainer.size(); i++) {
            sum += linkedContainer.getElementByIndex(i).getPayment();
        }
        avg = sum / linkedContainer.size();
        System.out.println("Sum payment = " + sum);
        System.out.println("Avg payment = " + avg);
    }

}