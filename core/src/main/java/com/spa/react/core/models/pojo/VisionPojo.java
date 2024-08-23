package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class VisionPojo {
    @ValueMapValue(name = "vision_text")
    private String visionText;
    @ValueMapValue(name = "vision_description")
    private String visionDescription;
    @ValueMapValue(name = "vision_img")
    private String visionImg;
    public String getVisionText() {
        return visionText;
    }

    public String getVisionDescription() {
        return visionDescription;
    }

    public String getVisionImg() {
        return visionImg;
    }
}
