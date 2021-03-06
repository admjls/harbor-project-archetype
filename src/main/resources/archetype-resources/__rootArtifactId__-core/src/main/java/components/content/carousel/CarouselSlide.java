package ${package}.components.content.carousel;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.carousel.v1.DefaultCarouselSlide;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Carousel Slide",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "carousel/carouselslide",
        resourceSuperType = DefaultCarouselSlide.RESOURCE_TYPE,
        actions = { "text: Carousel Slide", "-", "edit", "delete" },
        isContainer = true,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.Carousel.v1.Carousel.moveUp( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp")
                        }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.Carousel.v1.Carousel.moveDown( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown")
                        })
        },
        listeners = {
                @Listener(name = "afterinsert", value = "REFRESH_PARENT"),
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        })
public class CarouselSlide extends DefaultCarouselSlide {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/carousel/carouselslide";

}
