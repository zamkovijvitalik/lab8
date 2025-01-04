package work8;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a relational table with columns and rows.
 * Provides functionality to add rows and retrieve them.
 */
public class Table {
    private String name;
    private List<String> columns;
    private List<List<String>> rows;

    /**
     * Private constructor to create a new table.
     *
     * @param name    the name of the table.
     * @param columns the list of column names.
     */
    private Table(String name, List<String> columns) {
        this.name = name;
        this.columns = columns;
        this.rows = new ArrayList<>();
    }

    /**
     * Adds a new row to the table.
     *
     * @param row the row to be added.
     * @throws IllegalArgumentException if the row size does not match the number of columns.
     */
    public void addRow(List<String> row) {
        if (row.size() != columns.size()) {
            throw new IllegalArgumentException("Row size does not match column size");
        }
        rows.add(row);
    }

    /**
     * Retrieves all rows in the table.
     *
     * @return a list of rows, where each row is represented as a list of column values.
     */
    public List<List<String>> getRows() {
        return rows;
    }

    /**
     * Factory class to create instances of the Table class.
     */
    public static class TableFactory {

        /**
         * Creates a new table with the specified name and columns.
         *
         * @param name    the name of the table.
         * @param columns the list of column names.
         * @return a new instance of the Table class.
         */
        public static Table createTable(String name, List<String> columns) {
            return new Table(name, columns);
        }
    }
}