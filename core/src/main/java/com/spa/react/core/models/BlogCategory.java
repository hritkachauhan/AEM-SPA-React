package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.BlogCategoryPojo;

import java.util.List;

public interface BlogCategory extends ComponentExporter {
    List<BlogCategoryPojo> getBlogCategory();
}
