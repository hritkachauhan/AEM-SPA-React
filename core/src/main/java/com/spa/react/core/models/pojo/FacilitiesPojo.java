package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FacilitiesPojo {
    @ValueMapValue(name = "facility_text")
    private String facilityText;
    @ValueMapValue(name = "facility_description")
    private String facilityDescription;
    @ValueMapValue(name="facility_img")
    private String facilityImg;

    public String getFacilityText() {
        return facilityText;
    }

    public String getFacilityDescription() {
        return facilityDescription;
    }

    public String getFacilityImg() {
        return facilityImg;
    }
}
