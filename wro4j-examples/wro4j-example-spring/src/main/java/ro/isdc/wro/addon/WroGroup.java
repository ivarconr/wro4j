package ro.isdc.wro.addon;

import ro.isdc.wro.model.resource.ResourceType;

import java.util.Collection;

/**
 * Value bean to represent wro-group definitions.
 *
 * To configure a new resource group in spring add the following to applicationContext.xml:
 * <bean class="ro.isdc.wro.addon.WroGroup">
 *    <property name="groupName" value="main"/>
 *    <property name="uris">
 *        <list>
 *            <value>/styles/main.css</value>
 *       </list>
 *   </property>
 *    <property name="resourceType" value="CSS"/>
 * </bean>
 */
public class WroGroup {

    /**
     * The Wro group name, will result in groupName.resourceType
     * e.g groupName plugins and ResourceType.CSS would result in file named plugins.css
     */
    private String groupName;

    /**
     * The uri to where wro should start looking for files in this group.
     * The format of the uri is exactly as specified in wro4j uri documentation
     */
    private Collection<String> uris;

    /**
     * ResourceType. Can be CSS or JS.
     */
    private ResourceType resourceType;

    public WroGroup() {}

    public void setUris(Collection<String> uris) {
        this.uris = uris;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Collection<String> getUris() {
        return uris;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public String getGroupName() {
        return groupName;
    }
}