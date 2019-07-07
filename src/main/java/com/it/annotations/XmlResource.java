package com.it.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks the fields that should be initialized by {@link XmlResourceProcessor}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface XmlResource {

    /**
     * Path to xml with test data
     */
    String path() default "";

    /**
     * Multiple paths to xml with test data. Should be used for fields with type {@link java.util.List}
     */
    String[] paths() default {};

}
