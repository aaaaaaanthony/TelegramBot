package org.example.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface ResponseResultTypes {
    Class clz = null;
}

