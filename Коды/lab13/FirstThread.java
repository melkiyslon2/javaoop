public class FirstThread implements Runnable {

    linkedContainer<SecondCreate> linkedContainer;

    public FirstThread(linkedContainer<SecondCreate> linkedContainer)
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
    }

}
