package com.gregdferrell.designpatterns.bridge;

import java.util.List;

/**
 * Created by Greg on 8/1/2017.
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract String getHeader();

    protected abstract List<Detail> getDetails();

}
