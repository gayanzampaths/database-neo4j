package gs.mc.tools.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class ModuleDependency
{

    @GraphId
    private Long id;

    private String jiraId;

    @Relationship(type = "DEPENDENT_MODULE", direction = Relationship.INCOMING)
    private List<Module> modules;

    public ModuleDependency()
    {

    }

    public Long getId() {
        return id;
    }

    public String getJiraId() {
        return jiraId;
    }

    public List<Module> getModules()
    {
        return modules;
    }
}
