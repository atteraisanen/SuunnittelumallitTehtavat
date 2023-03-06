import java.util.Iterator;
import java.util.List;

public class EveryElementStrategy implements ListConverter {
    @Override
    public String listToString(List<?> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}