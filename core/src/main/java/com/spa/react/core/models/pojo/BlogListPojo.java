package com.spa.react.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class BlogListPojo {
    @ValueMapValue(name = "blog_img")
    private String blogImg;
    @ValueMapValue(name = "blog_link")
    private String blogLink;
    @ValueMapValue(name = "blog_name")
    private String blogName;
    @ValueMapValue(name = "blog_title")
    private String blogTitle;
    @ValueMapValue(name = "blog_date")
    private String blogDate;

    public String getBlogImg() {
        return blogImg;
    }

    public String getBlogLink() {
        return blogLink;
    }

    public String getBlogName() {
        return blogName;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public String getBlogDate() {
        return blogDate;
    }
}
