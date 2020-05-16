package com.chinda.tinyspring.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装一个对象所有的PropertyValue。<br/>
 * 为什么封装而不是直接用List?因为可以封装一些操作。
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
@Getter
@NoArgsConstructor
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        // 这里可以对于重复propertyName进行判断，直接用list没法做到
        this.propertyValueList.add(pv);
    }
}
