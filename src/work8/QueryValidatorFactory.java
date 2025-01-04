package work8;

/**
 * Factory class to create query validators based on the query type.
 */
public class QueryValidatorFactory {

    /**
     * Creates a query validator based on the query type.
     *
     * @param queryType the type of the query (e.g., "select", "insert").
     * @return the corresponding query validator.
     * @throws IllegalArgumentException if the query type is unknown.
     */
    public static QueryValidator createValidator(String queryType) {
        switch (queryType.toLowerCase()) {
            case "select":
                return new SelectQueryValidator();
            case "insert":
                return new InsertQueryValidator();
            default:
                throw new IllegalArgumentException("Unknown query type: " + queryType);
        }
    }
}