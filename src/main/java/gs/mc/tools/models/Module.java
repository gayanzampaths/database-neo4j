package gs.mc.tools.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Module
{

    @GraphId
    private Long id;
    private String groupId;
    private String artifactId;
    private String version;
    private String description;

    public Module()
    {

    }

    public Long getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public String getArtifactId()
    {
        return artifactId;
    }

    public String getVersion()
    {
        return version;
    }
}
