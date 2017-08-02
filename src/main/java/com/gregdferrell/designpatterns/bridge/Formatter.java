package com.gregdferrell.designpatterns.bridge;

import java.util.List;

/**
 * Created by Greg on 8/1/2017.
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
