package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServicePojo {
    @ValueMapValue(name = "service_heading")
    private String serviceHeading;
    @ValueMapValue(name = "service_text")
    private String serviceText;

    public String getServiceHeading() {
        return serviceHeading;
    }

    public String getServiceText() {
        return serviceText;
    }
}