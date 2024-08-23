package com.spa.react.core.models.pojo;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ExpertisePojo {
    @ValueMapValue(name = "expertise_text")
    private String expertiseText;
    public String getExpertiseText() {
        return expertiseText;
    }
}
