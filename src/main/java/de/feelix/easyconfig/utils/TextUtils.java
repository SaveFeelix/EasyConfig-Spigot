package de.feelix.easyconfig.utils;

import org.jetbrains.annotations.NotNull;

/**
 * Class to replace text
 */
public abstract class TextUtils {

    /**
     * The Message
     */
    private static String selfMessage;

    /**
     * Prepared Method to replace a string with another string
     * @param message the original Message
     * @param variable the variable to replace
     * @param replace the replace text
     * @return the Message
     */
    public static @NotNull String checkOther(@NotNull String message, @NotNull String variable, @NotNull String replace) {
        selfMessage = "";
        selfMessage = (message.toLowerCase().contains(variable.toLowerCase())) ? message.replace(variable, replace) : message;
        return selfMessage;
    }
    /**
     * Prepared Method to replace a char with another char
     * @param message the original Message
     * @param variable the variable to replace
     * @param replace the replace text
     * @return the Message
     */
    public static @NotNull String checkOther(@NotNull String message, @NotNull Character variable, @NotNull Character replace) {
        selfMessage = "";
        selfMessage = (message.toLowerCase().contains(variable.toString().toLowerCase())) ? message.replace(variable, replace) : message;
        return selfMessage;
    }
}