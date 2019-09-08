package Args;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArgsParser {

    private Map<String, Object> values;
    private final Map<String, String> schemaMap;

    public ArgsParser(String value) {
        schemaMap = paserSchema(value);
    }

    public void paser(String[] args) {
        values = new HashMap<>();
        for (Map.Entry<String, String> entry : schemaMap.entrySet()) {
            String flagname = entry.getKey();
            String type = entry.getValue();
            if (type.equals("bool")) {
                values.put(flagname, Arrays.asList(args).contains("-" + flagname));
            } else {
                String arg = args[Arrays.asList(args).indexOf("-" + flagname) + 1];
                if (type.equals("int")) {
                    values.put(flagname, Integer.parseInt(arg));
                } else {
                    values.put(flagname, arg);
                }
            }

        }

    }

    private Map<String, String> paserSchema(String value) {


        Map<String, String> schemaMap = new HashMap<>();
        String[] array = value.split(" ");
        for (String pair : array) {
            String[] flagdeffintion = pair.split(":");
            schemaMap.put(flagdeffintion[0],flagdeffintion[1]);
        }

        return schemaMap;
    }

    public Object getValue(String flag) {

        return values.get(flag);
    }
}
