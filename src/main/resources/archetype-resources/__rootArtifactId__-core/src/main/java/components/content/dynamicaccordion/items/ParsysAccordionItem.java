package ${package}.components.content.dynamicaccordion.items;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(value = "Parsys Accordion Item",
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamicaccordion.items.parsysaccordionitem.v1.ParsysAccordionItem.RESOURCE_TYPE,
        actions = { "text: Parsys Accordion Item", "edit", "-", "delete" },
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.DynamicAccordion.v1.DynamicAccordion.moveUp( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp") }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.DynamicAccordion.v1.DynamicAccordion.moveDown( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown") })
        },
        name = "dynamicaccordion/items/parsysaccordionitem",
        listeners = {
                @Listener(name = "afterinsert", value = "REFRESH_PARENT"),
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        })
public class ParsysAccordionItem extends com.icfolson.aem.harbor.core.components.content.dynamicaccordion.items.parsysaccordionitem.v1.ParsysAccordionItem {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/dynamicaccordion/items/parsysaccordionitem";

}
