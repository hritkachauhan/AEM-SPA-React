package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.Course;
import com.spa.react.core.models.Expertise;
import com.spa.react.core.models.pojo.CoursePojo;
import com.spa.react.core.models.pojo.ExpertisePojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {Expertise.class, ComponentExporter.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = ExpertiseImpl.RESOURCE_TYPE
)
public class ExpertiseImpl implements Expertise {
    static final String RESOURCE_TYPE="spa-react/components/content/expertise";
    @ValueMapValue(name = "expertise_title")
    private String expertiseTitle;
    @ValueMapValue(name = "expertise_description")
    private String expertiseDescription;
    @ChildResource
    private List<ExpertisePojo> expertise;
    @Override
    public String getExpertiseTitle() {
        return expertiseTitle;
    }

    @Override
    public String getExpertiseDescription() {
        return expertiseDescription;
    }

    @Override
    public List<ExpertisePojo> getExpertise() {
        return expertise;
    }

    @Override
    public String getExportedType() {
        return ExpertiseImpl.RESOURCE_TYPE;
    }
}
