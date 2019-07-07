package com.it.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Message {

    /**
     * <p>Message placeholder of method
     * <p>Message can contains stardart java format placeholders
     * <p>see {@link String#format(String, Object...)}
     */
    String value();
}
