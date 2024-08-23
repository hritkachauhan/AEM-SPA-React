package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.CoursePojo;

import java.util.List;

public interface Course extends ComponentExporter {
    String getCourseTitle();
    String getCourseDescription();
    List<CoursePojo> getCourse();
}
