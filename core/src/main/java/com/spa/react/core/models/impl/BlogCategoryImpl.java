package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.BlogCategory;
import com.spa.react.core.models.pojo.BlogCategoryPojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
       adapters = {BlogCategory.class, ComponentExporter.class},
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
       resourceType = BlogCategoryImpl.RESOURCE_TYPE)
@Exporter(name= ExporterConstants.SLING_MODEL_EXPORTER_NAME,extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class BlogCategoryImpl implements BlogCategory {
    static final String RESOURCE_TYPE="spa-react/components/content/blogCategory";
    @ChildResource(name = "blogCategory")
    private List<BlogCategoryPojo> blogCategory;
    @Override
    public List<BlogCategoryPojo> getBlogCategory() {
        return blogCategory;
    }

    @Override
    public String getExportedType() {
        return BlogCategoryImpl.RESOURCE_TYPE;
    }
}
