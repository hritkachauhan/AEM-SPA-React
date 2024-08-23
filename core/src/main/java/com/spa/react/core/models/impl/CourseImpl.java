package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Course;
import com.spa.react.core.models.pojo.CoursePojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {Course.class, ComponentExporter.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = CourseImpl.RESOURCE_TYPE
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CourseImpl implements Course {
    static final String RESOURCE_TYPE="spa-react/components/content/course";
    @ValueMapValue(name = "course_title")
    private String courseTitle;
    @ValueMapValue(name = "course_description")
    private String courseDescription;
    @ChildResource
    private List<CoursePojo> course;
    @Override
    public String getCourseTitle() {
        return courseTitle;
    }

    @Override
    public String getCourseDescription() {
        return courseDescription;
    }

    @Override
    public List<CoursePojo> getCourse() {
        System.out.println("Course List: " + course);
        return course;
    }

    @Override
    public String getExportedType() {
        return CourseImpl.RESOURCE_TYPE;
    }
}
