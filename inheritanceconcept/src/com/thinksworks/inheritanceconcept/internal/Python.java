package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Course;

public class Python extends Course {
    public Python(String name, int cost, String duration, int strength, boolean isPlacement) {
        super(name, cost, duration, strength, isPlacement);
    }
}
