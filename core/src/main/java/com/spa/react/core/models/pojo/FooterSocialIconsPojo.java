package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterSocialIconsPojo {
    @ValueMapValue(name = "icon_img")
    private String iconImage;
    @ValueMapValue(name="icon_url")
    private String iconUrl;
    public String getFooterIconImg() {
        return iconImage;
    }
    public String getFooterIconUrl() { return iconUrl;}
}
