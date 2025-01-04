import work8.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> columns = List.of("id", "name", "age");
        Table table = Table.TableFactory.createTable("Person", columns);
        table.addRow(List.of("1", "Alice", "30"));
        table.addRow(List.of("2", "Bob", "25"));

        DatabaseSchema schema = DatabaseSchema.getInstance();
        schema.addTable(table);

        QueryValidator selectValidator = QueryValidatorFactory.createValidator("select");
        boolean isValid = selectValidator.validate("SELECT * FROM Person");
        System.out.println("Is valid query: " + isValid);
    }
}