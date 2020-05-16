package com.chinda.tinyspring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class PropertyValue {
    private String name;
    private Object value;
}
