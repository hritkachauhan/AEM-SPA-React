package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.BlogListPojo;

import java.util.List;

public interface BlogList extends ComponentExporter {
    List<BlogListPojo> getBlogList();
}
