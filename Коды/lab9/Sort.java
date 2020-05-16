public class Sort {

    public void Sort(linkedContainer linkedContainer)
    {
        creationClass create = new creationClass();
        linkedContainer<creationClass> sortcontainer = new linkedContainer<>();

        sortcontainer = linkedContainer;

        for(creationClass t : sortcontainer)
        {
            System.out.println(t);
            System.out.println();
        }

    }



}
