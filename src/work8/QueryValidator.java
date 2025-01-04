package work8;

/**
 * Interface for query validators.
 * Each specific query validator should implement this interface.
 */
public interface QueryValidator {

    /**
     * Validates a given query string.
     *
     * @param query the query string to be validated.
     * @return true if the query is valid, false otherwise.
     */
    boolean validate(String query);
}