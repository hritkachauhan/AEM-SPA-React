package com.spa.react.core.models.impl;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Footer;
import com.spa.react.core.models.pojo.FooterPojo;
import com.spa.react.core.models.pojo.FooterSocialIconsPojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {Footer.class, ComponentExporter.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = FooterImpl.RESOURCE_TYPE)
@Exporter(name= ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class FooterImpl implements Footer {
    static final String RESOURCE_TYPE="spa-react/components/content/footer";

    @ValueMapValue(name = "footer_heading")
    private String footerHeading;
    @ValueMapValue(name = "infodales")
    private String infodales;
    @ValueMapValue(name = "infodales_link")
    private String infodalesLink;
    @ChildResource(name = "footer_link")
    private List<FooterPojo> footerLink;
    @ValueMapValue(name="icon_img1")
    private String iconImg1;
    @ValueMapValue(name="icon_img2")
    private String iconImg2;
    @Override
    public String getFooterHeading() {
        return footerHeading;
    }

    @Override
    public String getInfodales() {
        return infodales;
    }

    @Override
    public String getInfodalesLink() {
        return infodalesLink;
    }

    @Override
    public List<FooterPojo> getFooterLink() {
        return footerLink;
    }

    @Override
    public String getIconImg1() {
        return iconImg1;
    }

    @Override
    public String getIconImg2() {
        return iconImg2;
    }


    @Override
    public String getExportedType() {
        return FooterImpl.RESOURCE_TYPE;
    }
}
