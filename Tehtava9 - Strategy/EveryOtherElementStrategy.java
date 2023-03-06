import java.util.List;

public class EveryOtherElementStrategy implements ListConverter {
    @Override
    public String listToString(List<?> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toString());
            if ((i + 1) % 2 == 0) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}