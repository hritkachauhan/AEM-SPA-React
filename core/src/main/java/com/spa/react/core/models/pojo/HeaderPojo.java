package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderPojo {
  @ValueMapValue
    private String name;
  @ValueMapValue
    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
