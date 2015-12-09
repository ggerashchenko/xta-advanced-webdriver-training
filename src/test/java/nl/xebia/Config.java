package nl.xebia;

public class Config {

    private String baseUrl = envOrElse("SELENIUM_BASE_URL", "http://www.bol.com");

    /**
     * Attempts to load a value from an environment variable. Falls back to a default value if the env var was not set.
     * @param envVar The environment variable to load.
     * @param defaultValue The default value in case the env var does not exist.
     * @return Environment variable or default value;
     */
    private String envOrElse(String envVar, String defaultValue) {
        if (System.getenv(envVar) != null) {
            return System.getenv(envVar);
        } else {
            return defaultValue;
        }
    }
}
