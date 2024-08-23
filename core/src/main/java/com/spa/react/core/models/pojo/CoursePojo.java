package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CoursePojo {
    @ValueMapValue(name = "course_img")
    private String courseImg;
    @ValueMapValue(name = "course_text")
    private String courseText;

    public String getCourseImg() {
        return courseImg;
    }

    public String getCourseText() {
        return courseText;
    }
}