package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterPojo {
    @ValueMapValue(name = "footer_name")
    private String footerName;
    @ValueMapValue(name = "footer_url")
    private String footerUrl;

    public String getFooterName() {
        return footerName;
    }

    public String getFooterUrl() {
        return footerUrl;
    }
}
