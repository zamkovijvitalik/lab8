package work8;

/**
 * Validator for INSERT queries.
 */
public class InsertQueryValidator implements QueryValidator {

    /**
     * Validates if the given query is a valid INSERT query.
     *
     * @param query the query string to be validated.
     * @return true if the query is a valid INSERT query, false otherwise.
     */
    @Override
    public boolean validate(String query) {
        return query.trim().toLowerCase().startsWith("insert");
    }
}