package work8;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the schema of a database, ensuring only one instance of the schema exists.
 */
public class DatabaseSchema {
    private static DatabaseSchema instance;
    private List<Table> tables;

    /**
     * Private constructor to initialize the schema with no tables.
     */
    private DatabaseSchema() {
        this.tables = new ArrayList<>();
    }

    /**
     * Returns the single instance of the DatabaseSchema.
     * If the instance does not exist, it creates a new one.
     *
     * @return the singleton instance of the DatabaseSchema.
     */
    public static synchronized DatabaseSchema getInstance() {
        if (instance == null) {
            instance = new DatabaseSchema();
        }
        return instance;
    }

    /**
     * Adds a table to the schema.
     *
     * @param table the table to be added.
     */
    public void addTable(Table table) {
        tables.add(table);
    }

    /**
     * Retrieves all tables in the schema.
     *
     * @return a list of tables.
     */
    public List<Table> getTables() {
        return tables;
    }
}