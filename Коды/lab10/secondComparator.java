import java.util.Comparator;

public class secondComparator implements Comparator<SecondCreate>
{
    @Override
    public int compare(SecondCreate o1, SecondCreate o2)
    {
        return o1.getEducation().compareTo(o2.getEducation());
    }
}