package ro.isdc.wro.addon;

import ro.isdc.wro.model.WroModel;
import ro.isdc.wro.model.group.Group;
import ro.isdc.wro.model.resource.Resource;

import java.util.Collection;

public class WroModelFactory implements ro.isdc.wro.model.factory.WroModelFactory {

    private Collection<WroGroup> groups;
    
    public WroModelFactory(Collection<WroGroup> groups){
        this.groups = groups;
    }

    /**
     * Factory method to create the WroModel. 
     * it creates groups of cssfiles which will be bundled in single files.
     * @return the model to be used by WroFilter
     */
    public WroModel create() {
            WroModel model = new WroModel();
            for(WroGroup group : groups){
                
                model.addGroup(createGroup(group));
            }
            return model;
    }
    
    private Group createGroup(WroGroup wroGroup){
        Group group = new Group(wroGroup.getGroupName());
        for(String uri : wroGroup.getUris()){
            group.addResource(Resource.create(uri, wroGroup.getResourceType()));
        }
        return group;
    }
    
    public void destroy() {
    }

}
