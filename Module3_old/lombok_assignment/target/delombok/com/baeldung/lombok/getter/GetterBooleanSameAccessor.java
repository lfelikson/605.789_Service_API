// Generated by delombok at Tue Jun 29 20:53:44 EDT 2021
package com.baeldung.lombok.getter;

/**
 * Related Article Sections:
 * 3.1. A boolean Field Having the Same Name With Its Accessor
 */
public class GetterBooleanSameAccessor {
    private boolean isRunning = true;

    @SuppressWarnings("all")
    public boolean isRunning() {
        return this.isRunning;
    }
}
