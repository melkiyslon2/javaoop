import java.util.Comparator;

public class comparatorC implements Comparator<SecondCreate> {

    @Override
    public int compare(SecondCreate o1, SecondCreate o2) {
        return o1.getSpecialisation().compareTo(o2.getSpecialisation());
    }

}