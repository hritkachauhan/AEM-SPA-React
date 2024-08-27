package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.BlogList;
import com.spa.react.core.models.pojo.BlogListPojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
        adapters ={BlogList.class, ComponentExporter.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = BlogListImpl.RESOURCE_TYPE
)
@Exporter(name= ExporterConstants.SLING_MODEL_EXPORTER_NAME,extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class BlogListImpl implements BlogList {
    static final String RESOURCE_TYPE="spa-react/components/content/blogList";
    @ChildResource(name="blogList")
    private List<BlogListPojo> blogList;
    @Override
    public List<BlogListPojo> getBlogList() {
        return blogList;
    }

    @Override
    public String getExportedType() {
        return BlogListImpl.RESOURCE_TYPE;
    }
}
