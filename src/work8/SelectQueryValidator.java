package work8;

/**
 * Validator for SELECT queries.
 */
public class SelectQueryValidator implements QueryValidator {

    /**
     * Validates if the given query is a valid SELECT query.
     *
     * @param query the query string to be validated.
     * @return true if the query is a valid SELECT query, false otherwise.
     */
    @Override
    public boolean validate(String query) {
        return query.trim().toLowerCase().startsWith("select");
    }
}