package gui;

import java.net.URL;

/**
 * Utility class for loading resources that works in both JAR and Gradle runtime environments.
 */
public class ResourceLoader {

    /**
     * Loads a resource from the classpath, trying multiple approaches to handle
     * both JAR packaging and Gradle runtime environments.
     *
     * @param resourcePath the path to the resource (e.g., "ICON/arrow.gif")
     * @return the URL of the resource, or null if not found
     */
    public static URL getResource(String resourcePath) {
        // Try with leading slash (absolute path in JAR)
        URL url = ResourceLoader.class.getResource("/" + resourcePath);
        if (url != null) {
            return url;
        }

        // Try without leading slash (relative path in Gradle runtime)
        url = ResourceLoader.class.getResource(resourcePath);
        if (url != null) {
            return url;
        }

        // Try system class loader
        url = ClassLoader.getSystemResource(resourcePath);
        if (url != null) {
            return url;
        }

        // Try context class loader
        url = Thread.currentThread().getContextClassLoader().getResource(resourcePath);
        if (url != null) {
            return url;
        }

        // Resource not found
        System.err.println("Warning: Could not load resource: " + resourcePath);
        return null;
    }
}

